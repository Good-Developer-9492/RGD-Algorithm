package Programmers.Lv2.Q77485;

public class Hyunho {
    //21.20ms, 90.7MB
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] board = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = i * columns + j + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] minPosition = {queries[i][0] - 1, queries[i][1] - 1};
            int[] maxPosition = {queries[i][2] - 1, queries[i][3] - 1};

            int start = board[minPosition[0]][minPosition[1]];
            int min = Integer.MAX_VALUE;

            // 좌측 라인 회전
            for (int j = minPosition[0]; j < maxPosition[0]; j++) {
                min = Math.min(min, board[j][minPosition[1]]);

                board[j][minPosition[1]] = board[j + 1][minPosition[1]];
            }

            // 하단 라인 회전
            for (int j = minPosition[1]; j < maxPosition[1]; j++) {
                min = Math.min(min, board[maxPosition[0]][j]);

                board[maxPosition[0]][j] = board[maxPosition[0]][j + 1];
            }

            // 우측 라인 회전
            for (int j = maxPosition[0]; j > minPosition[0]; j--) {
                min = Math.min(min, board[j][maxPosition[1]]);

                board[j][maxPosition[1]] = board[j - 1][maxPosition[1]];
            }

            // 윗 라인 회전
            for (int j = maxPosition[1]; j > minPosition[1]; j--) {
                min = Math.min(min, board[minPosition[0]][j]);

                board[minPosition[0]][j] = board[minPosition[0]][j - 1];
            }

            board[minPosition[0]][minPosition[1] + 1] = start;

            answer[i] = min;
        }

        return answer;
    }
}
