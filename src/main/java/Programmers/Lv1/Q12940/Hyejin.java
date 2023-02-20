package Programmers.Lv1.Q12940;

public class Hyejin {
    //0.03ms, 70.8MB
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        int gcd = gcd(a, b);
        return new int[]{gcd, (n * m) / gcd};
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
