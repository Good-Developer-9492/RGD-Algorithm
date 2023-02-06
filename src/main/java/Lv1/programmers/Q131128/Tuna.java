package Lv1.programmers.Q131128;

public class Tuna {
    // (0.06ms ~ 53.75ms / 67MB ~ 158MB)
    public String solution(String X, String Y) {
        int[] XCount = new int[10];
        int[] YCount = new int[10];

        // X에 속하는 0~9의 개수 파악
        for (int i = 0; i < X.length(); i++) {
            XCount[X.charAt(i) - '0']++;
        }

        // Y에 속하는 0~9의 개수 파악
        for (int i = 0; i < Y.length(); i++) {
            YCount[Y.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        // 가장 큰 수는 9부터 0까지 겹치는 값들을 전부 나열하는 것임
        for (int i = 9; i >= 0; i--) {
            sb.append(String.valueOf(i).repeat(Math.min(XCount[i], YCount[i])));
        }

        if (sb.length() == 0) {
            return "-1";
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
