package Programmers.Lv2.Q87946;

public class Tuna {
    // (0.4ms / 74MB)
    private static boolean[] check;
    public int solution(int k, int[][] dungeons) {
        int answer = Integer.MIN_VALUE;
        check = new boolean[dungeons.length];
        for (int i = 0; i < dungeons.length; i++) {
            check[i] = true;
            answer = Math.max(answer, getMaxAdventureCount(k - dungeons[i][1], dungeons));
            check[i] = false;
        }
        return answer;
    }

    private int getMaxAdventureCount(int k, int[][] dungeons) {
        int answer = 1;

        int recursiveCount = 0;
        for (int i = 0; i < dungeons.length; i++) {
            if (check[i] || dungeons[i][0] > k) continue;
            check[i] = true;
            recursiveCount = Math.max(recursiveCount, getMaxAdventureCount(k - dungeons[i][1], dungeons));
            check[i] = false;
        }

        return answer + recursiveCount;
    }
}
