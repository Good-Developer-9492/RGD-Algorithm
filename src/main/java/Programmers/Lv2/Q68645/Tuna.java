package Programmers.Lv2.Q68645;

public class Tuna {
    // (0.02ms ~ 28.23ms / 72.3MB ~ 130MB)
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        // 달팽이에 넣을 숫자
        int idx = 1;

        // 달팽이 위치 판단할 row, col
        int row = -1;
        int col = 0;
        // 테두리만 채워주는 작업을 진행할 것이고, 해당 작업은 n이 3씩 줄어들면서 반복
        // 3보다 높은 숫자의 n이면 내부의 n - 3의 테두리를 또 채워줘야 하기 때문
        for (int i = n; i > 0; i -= 3) {
            // 왼쪽에 붙어서 아래로 내려오는 부분
            for (int j = 0; j < i; j++) arr[++row][col] = idx++;
            // 가장 아래에서 오른쪽으로 진행되는 부분 (가장 아래의 왼쪽은 위에서 이미 진행됨)
            for (int j = 0; j < i - 1; j++) arr[row][++col] = idx++;
            // 오른쪽에 붙어서 위로 올라가는 부분 (가장 아래의 오른쪽은 위에서 이미 진행됨)
            for (int j = 0; j < i - 2; j++) arr[--row][--col] = idx++;
        }

        // 2차원 배열을 1차원 배열로 변환해주는 작업
        int[] answer = new int[n * (n + 1) / 2];
        int answerIdx = 0;
        for (int i = 0; i < n; i++) {
            // 달팽이기 때문에 j를 n까지 가지 않고 <= i까지로 진행
            for (int j = 0; j <= i; j++) {
                answer[answerIdx++] = arr[i][j];
            }
        }

        return answer;
    }
}
