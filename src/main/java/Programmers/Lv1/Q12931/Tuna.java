package Programmers.Lv1.Q12931;

public class Tuna {
    // (0.02ms / 75MB)
    public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
