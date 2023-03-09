package Programmers.Lv2.Q12953;

public class Tuna {
    public int solution(int[] arr) {
        int lcm = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int gcd = gcd(lcm, arr[i]);
            lcm = lcm * arr[i] / gcd;
        }

        return lcm;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
