package Programmers.Lv2.Q12980;

public class Tuna {
    // (0.02ms / 70MB)
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }

            n -= 1;
            answer++;
        }

        return answer;
    }
}
