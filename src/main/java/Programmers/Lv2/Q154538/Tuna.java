package Programmers.Lv2.Q154538;

import java.util.Arrays;

public class Tuna {
    // (0.24ms ~ 31.82ms / 73MB ~ 92.7MB)
    public int solution(int x, int y, int n) {
        // y의 값까지 저장해야 되므로 y+1 크기의 배열 생성
        int[] dp = new int[y + 1];

        // 초기값 지정
        // 최소값으로 dp를 진행할 건데, Integer.MAX_VALUE로 하면 +1되는순간 MIN_VALUE가 되서
        // 범위를 살펴보고 배열 내에 들어갈 수 있는 최대값 10000001 - 1 로 배열 초기화
        Arrays.fill(dp, 10000001);
        // 최초값 x는 0으로 초기화
        dp[x] = 0;
        // x + 1부터 y까지 dp 진행
        for (int i = x + 1; i <= y; i++) {
            // x에 n을 더하는 경우
            if (i - n >= x && dp[i - n] != 10000001) {
                dp[i] = Math.min(dp[i], dp[i - n] + 1);
            }

            // x에 2를 곱하는 경우
            if (i % 2 == 0 && dp[i / 2] != 10000001) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // x에 3을 곱하는 경우
            if (i % 3 == 0 && dp[i / 3] != 10000001) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        // dp값이 초기화값이라면 도달할 방법이 없음
        return dp[y] == 10000001 ? -1 : dp[y];
    }
}
