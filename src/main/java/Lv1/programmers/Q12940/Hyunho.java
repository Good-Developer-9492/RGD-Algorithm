package Lv1.programmers.Q12940;

public class Hyunho {
    //0.03ms, 78.5MB
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);

        return new int[]{gcd, n * m / gcd};
    }

    private int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        }
        return gcd(m, n % m);
    }
}
