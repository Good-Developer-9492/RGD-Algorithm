package Lv1.programmers.Q12928;

public class Hyunho {
    //(0.09ms, 73.9MB)
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
