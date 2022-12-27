package Lv1.programmers.Q77884;

public class Hyejin {
    //1.36ms, 80.1MB
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int result = divisors(i);
            if (result % 2 == 0) answer += i;
            if (result % 2 == 1) answer -= i;
        }
        return answer;
    }

    private int divisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        return count;
    }
}
