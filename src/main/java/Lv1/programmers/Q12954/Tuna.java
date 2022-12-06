package Lv1.programmers.Q12954;

public class Tuna {
    // (0.04ms, 77MB)
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }
}
