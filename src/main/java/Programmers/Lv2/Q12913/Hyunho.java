package Programmers.Lv2.Q12913;

public class Hyunho {
    //46.77ms, 105MB
    private static final Integer COLUMN_SIZE = 4;
    public int solution(int[][] land) {
        int[][] area = new int[land.length][COLUMN_SIZE];

        System.arraycopy(land[0], 0, area[0], 0, COLUMN_SIZE);

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < COLUMN_SIZE; k++) {
                    if (j == k) {
                        continue;
                    }
                    max = Math.max(max, area[i - 1][k]);
                }
                area[i][j] = max + land[i][j];
            }
        }

        int answer = 0;
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, area[area.length - 1][i]);
        }
        return answer;
    }
}
