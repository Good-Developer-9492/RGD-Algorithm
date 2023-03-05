package Programmers.Lv2.Q42842;

public class Tuna {
    // (3ms ~ 34ms / 70MB ~ 85MB)
    public int[] solution(int brown, int yellow) {
        int row = 2;
        int col;

        // 모든 row, col 조합을 탐색
        A: while (true) {
            col = 2;
            while (row * col < 2005000) {
                // 정답에 맞는 경우의 수
                if ((row - 2) * (col - 2) == yellow && row * col == brown + yellow)
                    break A;
                col++;
            }
            row++;
        }

        // 큰 값이 앞에 오도록 설정
        return new int[]{Math.max(row, col), Math.min(row, col)};
    }
}
