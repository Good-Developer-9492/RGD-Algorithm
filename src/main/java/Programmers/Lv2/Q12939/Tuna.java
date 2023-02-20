package Programmers.Lv2.Q12939;

public class Tuna {
    public String solution(String s) {
        // 정수별로 분리
        String[] sArr = s.split(" ");

        // 최대값 최소값 초기화
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 주어진 정수 탐색
        for (String str : sArr) {
            // 최대값 최소값 변경
            int num = Integer.parseInt(str);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return String.format("%d %d", min, max);
    }
}
