package Lv1.programmers.Q12934;

public class Hyunho {
    public long solution(long n) {
        //0.12ms, 73.8MB
        double positiveInteger = Math.sqrt(n);

        if (n % positiveInteger == 0) {
            return (long) Math.pow(positiveInteger + 1, 2);
        }

        return -1;
    }
}
