package Programmers.Lv2.Q87946;

public class Hyejin {
    //0.04ms, 67.8MB
    //3.47ms, 67MB
    int max = -1;

    public int solution(int k, int[][] dungeons) {
        boolean[] visit = new boolean[dungeons.length];

        goDungeons(0, visit, dungeons, k);

        return max;
    }

    public void goDungeons(int count, boolean[] visit, int[][] dungeons, int k) {
        //count가 던전의 개수와 같다면 리턴
        if (count == dungeons.length) {
            max = Math.max(count, max);
            return;
        }

        //다음 던전 탐색
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && k >= dungeons[i][0]) {

                visit[i] = true;
                goDungeons(count + 1, visit, dungeons, k - dungeons[i][1]);
                visit[i] = false;
            }
        }
        max = Math.max(count, max);
    }
}
