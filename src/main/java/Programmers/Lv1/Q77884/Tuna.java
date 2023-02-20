package Programmers.Lv1.Q77884;

public class Tuna {
    // (2ms, 70MB)
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            if(getDivisorCount(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public int getDivisorCount(int num) {
        int result = 0;

        int idx = 1;
        while(num >= idx) {
            if (num % idx == 0) {
                result++;
            }
            idx++;
        }

        return result;
    }
}
