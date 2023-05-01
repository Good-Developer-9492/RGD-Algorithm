package Programmers.Lv2.Q17679;

public class Tuna {
    // (2ms / 75MB)
    public int solution(int m, int n, String[] board) {
        // 주어진 값을 활용하여 2차원 map 만들기
        String[][] map = new String[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].split("");
        }
        // board를 순회하며 지워질 대상 탐색 (더이상 지워질 애가 없을때까지...)
        map = playGame(m, n, map);

        // board를 순회하며 비어있는 공간의 개수 파악
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j].equals("")) answer++;
            }
        }
        return answer;
    }

    // board를 탐색하며 지워질 대상 탐색
    private String[][] playGame(int m, int n, String[][] board) {
        // 지울 대상을 저장할 2차원 배열
        boolean[][] deleted = new boolean[m][n];
        // 지워질 대상이 존재하는지 확인할 flag
        boolean flag = false;

        // 지워질 대상 탐색
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                String now = board[i][j];
                if (now.equals("")) continue;
                if (board[i + 1][j].equals(now) && board[i][j + 1].equals(now) && board[i + 1][j + 1].equals(now)) {
                    deleted[i][j] = true;
                    deleted[i + 1][j] = true;
                    deleted[i][j + 1] = true;
                    deleted[i + 1][j + 1] = true;
                    flag = true;
                }
            }
        }

        // 지워질 대상이 존재하지 않을 경우 재귀 종료
        if (!flag) return board;

        // 지워질 대상이 존재할 경우, 지워질 대상 제거
        for (int i = 0 ; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (deleted[i][j]) {
                    for (int k = i; k > 0; k--) {
                        board[k][j] = board[k - 1][j];
                        board[k - 1][j] = "";
                    }
                    board[0][j] = "";
                }
            }
        }
        // 대상들 제거한 이후 게임 재개 (재귀)
        return playGame(m, n, board);
    }
}
