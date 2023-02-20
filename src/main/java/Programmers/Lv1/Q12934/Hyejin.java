package Programmers.Lv1.Q12934;

public class Hyejin {
    //0.05ms, 66.4MB
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        System.out.println(n+1);
        return sqrt % 1 == 0 ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
