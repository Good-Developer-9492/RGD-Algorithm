package Lv1.programmers.Q77484;

public class Tuna {
    // (0.02ms, 75MB)
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = new int[]{6, 6, 5, 4, 3, 2, 1};
        int matchCount = 0;
        int zeroCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    matchCount++;
                    break;
                }
            }
        }

        return new int[]{rank[matchCount + zeroCount], rank[matchCount]};
    }
}
