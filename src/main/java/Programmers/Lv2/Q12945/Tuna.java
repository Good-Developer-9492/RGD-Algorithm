package Programmers.Lv2.Q12945;

public class Tuna {
    // (0.25ms / 75MB)
    private static final int NUM = 1234567;
    public int solution(int n) {
        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % NUM;
        }

        return dp[n];
    }
}
