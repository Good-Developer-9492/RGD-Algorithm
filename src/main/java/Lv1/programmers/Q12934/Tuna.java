package Lv1.programmers.Q12934;

public class Tuna {
    // (0.03ms, 75MB)
    public long solution(long n) {
        double temp = Math.sqrt(n);

        if (n % temp == 0) {
            return (long) Math.pow(temp + 1, 2);
        }

        return -1;
    }
}
