package Programmers.Lv2.Q12913;

public class Tuna {
    // (0.77ms ~ 20.58ms / 68.4MB ~ 85.8MB)
    int solution(int[][] land) {
        int answer = 0;

        // Dynamic Programming
        // 2차원 배열 DP 사용
        int[][] dp = new int[land.length][4];
        // DP의 첫 행은 land의 첫 행과 동일하다. 이전 값이 없기때문에 각 값이 최대값
        System.arraycopy(land[0], 0, dp[0], 0, 4);

        // 첫 행을 제외한 나머지 행 탐색
        for (int i = 1; i < land.length; i++) {
            // 각 행에서의 DP값 만들기
            for (int j = 0; j < 4; j++) {
                // 이전 행에서 이번 행과 같은 index를 제외한 나머지 중 최대값 탐색
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;
                    max = Math.max(max, dp[i - 1][k]);
                }
                // 탐색한 최대값에 현재 위치의 land값을 더하면 현재 위치에서의 최대값
                dp[i][j] = max + land[i][j];
            }
        }

        // 마지막 행의 결과들 중에서 최대값 탐색하면 정답
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, dp[land.length - 1][i]);
        }

        return answer;
    }
}
