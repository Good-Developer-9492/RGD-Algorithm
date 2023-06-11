package Programmers.Lv2.Q77485;

public class Hyejin {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        //yx
        //[[2,2,5,4],[3,3,6,6],[5,1,6,3]]

        int[][] arr = new int[rows][columns];
        //배열을 만든다
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = i * columns + j + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int startY = queries[i][0] - 1;
            int startX = queries[i][1] - 1;

            int endY = queries[i][2] - 1;
            int endX = queries[i][3] - 1;

            int min = Integer.MAX_VALUE;

            int firstNum = arr[startY][startX];

            //내 앞의 데이터를 내게 할당하기

            //좌측 이동시
            for (int j = startY; j < endY; j++) {
                min = Math.min(min, arr[j][startX]);
                arr[j][startX] = arr[j + 1][startX];
            }

            //아래로 내려갈 때
            for (int j = startX; j < endX; j++) {
                min = Math.min(min, arr[endY][j]);
                arr[endY][j] = arr[endY][j + 1];
            }

            //우측으로 이동할 때
            for (int j = endY; j > startY; j--) {
                min = Math.min(min, arr[j][endX]);
                arr[j][endX] = arr[j-1][endX];
            }

            //위로 올라갈 때
            for (int j = endX; j > startX; j--) {
                min = Math.min(min, arr[startY][j]);
                arr[startY][j] = arr[startY][j-1];
            }

            arr[startY][startX+1] = firstNum;

            answer[i] = min;
        }
        return answer;
    }
}
