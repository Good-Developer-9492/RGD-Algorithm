package Programmers.Lv1.Q12912;

public class Hyunho {
    //14.50ms, 83.3MB
    public long solution(int a, int b) {
        long answer = 0;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
