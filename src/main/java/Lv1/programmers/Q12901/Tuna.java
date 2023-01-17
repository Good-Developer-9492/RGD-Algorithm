package Lv1.programmers.Q12901;

public class Tuna {
    // (0.02ms, 74MB)
    public String solution(int a, int b) {
        int days = 0;

        for (int i = 1; i <= a; i++) {
            days += monthToDay(i);
        }
        days += b - 1;

        return divide(days);
    }

    private int monthToDay(int month) {
        return switch (month) {
            case 1 -> 0;
            case 2, 4, 6, 8, 9, 11 -> 31;
            case 3 -> 29;
            case 5, 7, 10, 12 -> 30;
            default -> throw new RuntimeException();
        };
    }

    private String divide(int num) {
        return switch (num % 7) {
            case 0 -> "FRI";
            case 1 -> "SAT";
            case 2 -> "SUN";
            case 3 -> "MON";
            case 4 -> "TUE";
            case 5 -> "WED";
            case 6 -> "THU";
            default -> throw new RuntimeException();
        };
    }
}
