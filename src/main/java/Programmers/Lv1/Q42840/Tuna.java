package Programmers.Lv1.Q42840;

public class Tuna {
    // (0.01 ~ 1.83ms / 75MB)
    public int[] solution(int[] answers) {
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first(i)) count[0]++;
            if (answers[i] == second(i)) count[1]++;
            if (answers[i] == third(i)) count[2]++;
        }

        if (count[0] < count[1]) {
            if (count[1] < count[2]) {
                return new int[]{3};
            } else if (count[1] == count[2]) {
                return new int[]{2, 3};
            } else {
                return new int[]{2};
            }
        } else if (count[0] == count[1]) {
            if (count[1] < count[2]) {
                return new int[]{3};
            } else if (count[1] == count[2]) {
                return new int[]{1, 2, 3};
            } else {
                return new int[]{1, 2};
            }
        } else { // count[0] > count[1]
            if (count[0] < count[2]) {
                return new int[]{3};
            } else if (count[0] == count[2]) {
                return new int[]{1, 3};
            } else {
                return new int[]{1};
            }
        }
    }

    private int first(int index) {
        return switch (index % 5) {
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 3;
            case 3 -> 4;
            case 4 -> 5;
            default -> throw new RuntimeException();
        };
    }

    private int second(int index) {
        return switch (index % 8) {
            case 0, 2, 4, 6 -> 2;
            case 1 -> 1;
            case 3 -> 3;
            case 5 -> 4;
            case 7 -> 5;
            default -> throw new RuntimeException();
        };
    }

    private int third(int index) {
        return switch (index % 10) {
            case 0, 1 -> 3;
            case 2, 3 -> 1;
            case 4, 5 -> 2;
            case 6, 7 -> 4;
            case 8, 9 -> 5;
            default -> throw new RuntimeException();
        };
    }
}
