package Lv1.programmers.Q12940;

public class Tuna {
    // (0.02ms, 73MB)
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        return new int[]{gcd, n * m / gcd};
    }

    private int gcd(int n, int m) {
        return n % m == 0 ? m : gcd(m, n % m);
    }
}
