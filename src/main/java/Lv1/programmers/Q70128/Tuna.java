package Lv1.programmers.Q70128;

public class Tuna {
    // (0.02ms, 75MB)
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
