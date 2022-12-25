package Lv1.programmers.Q12922;

public class Tuna {
    // (0.1ms, 75MB)
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append("수");
            else sb.append("박");
        }

        return sb.toString();
    }
}
