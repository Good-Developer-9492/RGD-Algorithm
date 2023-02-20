package Programmers.Lv1.Q12912;

public class Tuna {
    public long solution(int a, int b) {
        long sum = 0;
        while(a != b) {
            sum += a;

            if(a > b) a--; else a++;
        }
        return sum + b;
    }
}
