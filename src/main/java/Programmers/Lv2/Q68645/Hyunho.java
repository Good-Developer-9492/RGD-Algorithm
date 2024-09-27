package Programmers.Lv2.Q68645;

public class Hyunho {
    //0.02ms, 75.8MB - 13.92ms, 151MB
    public int[] solution(int n) {
        int[] answer = new int[n * (n + 1) / 2]; // 삼각형의 크기 ( 1 ~ n 까지 합)
        int[][] numbers = new int[n][n];

        int x = -1;
        int y = 0;
        int num = 1;

        //삼격형을 시작점부터 끝지점까지 순회하면 (왼쪽 대각선 아래, 아래 가로, 인쪽 대각선 위) 총 n번이 나온다
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) { // 대각선 아래
                    x++;
                } else if (i % 3 == 1) { // 가로
                    y++;
                } else if (i % 3 == 2) { // 대각선 위
                    x--;
                    y--;
                }
                numbers[x][y] = num++;

            }
            System.out.println();
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] == 0) {
                    break;
                }

                answer[index++] = numbers[i][j];
            }
        }

        return answer;
    }
}
