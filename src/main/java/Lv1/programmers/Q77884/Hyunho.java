package Lv1.programmers.Q77884;

public class Hyunho {
    //3.83ms, 72.7MB
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int divisorsCount = calcDivisors(i);

            if (divisorsCount % 2 == 0) answer += i;
            if (divisorsCount % 2 == 1) answer -= i;
        }

        return answer;
    }

    private int calcDivisors(int i) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) count++;
        }
        return count;
    }
}
