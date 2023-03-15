package Programmers.Lv2.Q12914;

public class Hyunho {
    //0.17ms, 75MB
    public long solution(int n) {
        long[] numberOfCase = new long[n+1];
        numberOfCase[1] = 1;

        if (n > 1) {
            numberOfCase[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            numberOfCase[i] = (numberOfCase[i-1] + numberOfCase[i-2]) % 1234567;
        }
        return numberOfCase[n];
    }
}
