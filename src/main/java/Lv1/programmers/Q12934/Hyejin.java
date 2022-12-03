package Lv1.programmers.Q12934;

public class Hyejin {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        System.out.println(n+1);
        return sqrt % 1 == 0 ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
