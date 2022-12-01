package Lv1.programmers.Q12928;

public class Tuna {
    // 0.03ms, 75MB
    public int solution(int n) {
        int sum = 0;

        int idx = 1;
        while (idx <= n) {
            if (n % idx == 0) {
                sum += idx;
            }
            idx++;
        }

        return sum;
    }
}
