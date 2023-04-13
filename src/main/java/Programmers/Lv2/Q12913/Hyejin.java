package Programmers.Lv2.Q12913;

public class Hyejin {
    //0.76ms, 77MB
    //20.28ms, 86.4MB
    public int solution(int[][] land) {
        int[][] maxGraph = new int[land.length][4];

        //첫번째 줄 그대로 넣기
        for (int i = 0; i < 4; i++) {
            maxGraph[0][i] = land[0][i];
        }

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    //이전 값 + 현재 줄 더한 중 가장 큰 값들 넣기
                    if (j == k) continue;
                    max = Math.max(max, maxGraph[i - 1][k]);
                }
                maxGraph[i][j] = max +  land[i][j];
            }
        }
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            //마지막줄에서 가장 큰값이 더해서 나오는 최댓값
            answer = Math.max(answer, maxGraph[maxGraph.length - 1][i]);
        }
        return answer;
    }

}
