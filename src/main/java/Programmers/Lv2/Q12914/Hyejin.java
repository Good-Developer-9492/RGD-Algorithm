package Programmers.Lv2.Q12914;

public class Hyejin {
    //0.04ms
    //0.14ms, 74.5MB
    public long solution(int n) {
        if (n == 1) return 1;
        int[] dy = new int[n + 1];
        //첫번째 계단 오르는 방법
        dy[1] = 1;
        //두번째 계단 오르는 방법
        dy[2] = 2;
        //두번째 전 계단 + 이전 계단
        for (int i = 3; i <= n; i++) {
            dy[i] = (dy[i - 1] + dy[i - 2]) % 1234567;
        }
        return dy[n] ;
    }


}
