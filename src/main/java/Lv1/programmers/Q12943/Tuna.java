package Lv1.programmers.Q12943;

public class Tuna {
    // (0.02ms, 75MB)
    public int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if(answer >= 500) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }

        return answer;
    }
}
