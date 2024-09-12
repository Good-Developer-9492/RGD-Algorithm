package Programmers.Lv2.Q77485;

public class Tuna {
    public int[] solution(int rows, int columns, int[][] queries) {
        // map 초기화
        int[][] map = new int[rows][columns];
        int idx = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                map[i][j] = idx++;
            }
        }

        // 쿼리별로 최소값 뽑아내므로, answer의 크기는 queries의 크기
        int[] answer = new int[queries.length];
        // queries 순회, 단 index가 필요하므로 x사용
        for (int x = 0; x < queries.length; x++) {
            // queries에서 값 추출 (array와 index 맞추기)
            int startRow = queries[x][0] - 1;
            int startCol = queries[x][1] - 1;
            int endRow = queries[x][2] - 1;
            int endCol = queries[x][3] - 1;

            // 위 line
            // 가장 우측값
            int upNum = map[startRow][endCol];
            int min = upNum;
            // 오른쪽부터 왼쪽으로 반복하면서 왼쪽값을 오른쪽으로 옮기기
            for (int i = endCol; i >= startCol + 1; i--) {
                map[startRow][i] = map[startRow][i - 1];
                min = Math.min(min, map[startRow][i]);
            }

            // 오른쪽 line
            // 가장 아래값
            int rightNum = map[endRow][endCol];
            min = Math.min(min, rightNum);
            // 아래부터 위로 반복하면서 위 값을 아래로 옮기기
            for (int i = endRow; i >= startRow + 2; i--) {
                map[i][endCol] = map[i - 1][endCol];
                min = Math.min(min, map[i][endCol]);
            }
            // 위 line에서 가져온 가장 우측값을 넣어주기
            map[startRow + 1][endCol] = upNum;

            // 아래 line
            // 가장 좌측값
            int downNum = map[endRow][startCol];
            min = Math.min(min, downNum);
            // 왼쪽부터 오른쪽으로 반복하면서 오른쪽값을 왼쪽으로 옮기기
            for (int i = startCol; i <= endCol - 2; i++) {
                map[endRow][i] = map[endRow][i + 1];
                min = Math.min(min, map[endRow][i]);
            }
            // 오른쪽 line에서 가져온 가장 아래값을 넣어주기
            map[endRow][endCol - 1] = rightNum;

            // 왼쪽 line
            // 위부터 아래로 반복하면서 아래값을 위로 넣어주기
            for (int i = startRow; i <= endRow - 2; i++) {
                map[i][startCol] = map[i + 1][startCol];
                min = Math.min(min, map[i][startCol]);
            }
            // 아래 line에서 가져온 가장 좌측값을 넣어주기
            map[endRow - 1][startCol] = downNum;

            // 최소값 배열에 저장
            answer[x] = min;
        }

        return answer;
    }
}
