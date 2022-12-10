package Lv1.programmers.Q87389;

public class Tuna {
    // (0.02ms, 75MB) 첫번째 케이스가 약 5ms걸림
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < 1000000; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
