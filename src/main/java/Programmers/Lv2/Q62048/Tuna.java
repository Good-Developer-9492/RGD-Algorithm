package Programmers.Lv2.Q62048;

public class Tuna {
    public long solution(int w, int h) {
        long answer = (long) w * h;

        int gcd = gcd(w, h);

        int ww = w / gcd;
        int hh = h / gcd;

        return answer - (long) (ww + hh - 1) * gcd;
    }

    private int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }
}
