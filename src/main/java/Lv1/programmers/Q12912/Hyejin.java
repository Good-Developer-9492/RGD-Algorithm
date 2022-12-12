package Lv1.programmers.Q12912;

public class Hyejin {
    public long solution(int a, int b) {
        //7.68ms, 84.8MB
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        long answer = 0;
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        return answer;
    }
}
