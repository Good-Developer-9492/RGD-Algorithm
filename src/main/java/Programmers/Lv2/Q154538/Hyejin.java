package Programmers.Lv2.Q154538;

public class Hyejin {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        //x부터 1씩 증가하면서 y를 만드는 방법을 찾는다
        for (int i = x + 1; i <= y; i++) {

            int num = Integer.MAX_VALUE - 1;
            //2를 곱해서 i가 나올 수 있는지
            if (isAvailable(i, 2, x)) {
                num = Math.min(num, dp[i / 2]);
            }
            //3을 곱해서 i가 나올 수 있는지
            if (isAvailable(i, 3, x)) {
                num = Math.min(num, dp[i / 3]);
            }
            //n을 더해서 i가 나올 수 있는지
            if (isOverX(x,i - n)) {
                num = Math.min(num, dp[i - n]);
            }
            dp[i] = Math.min(Integer.MAX_VALUE, num+1);
        }
        return dp[y] == Integer.MAX_VALUE ? -1 : dp[y];

    }

    private boolean isAvailable(int i, int div, int x) {
        return i / div > 0 && i % div == 0 && isOverX(x,i/div);
    }

    private boolean isOverX(int x, int i) {
        return i >= x;
    }

}
