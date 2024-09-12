package Programmers.Lv2.Q68936;

public class Tuna {
    // (0.04ms ~ 12.96ms / 64.4MB ~ 122MB)
    private int[] answer;
    public int[] solution(int[][] arr) {
        // 정답 저장할 배열
        answer = new int[2];

        // 압축하여 카운팅할 재귀함수 호출
        recursive(arr, 0, 0, arr.length);

        return answer;
    }

    // 압축하여 카운팅할 재귀함수
    private void recursive(int[][] arr, int row, int col, int length) {
        // 길이가 1인 경우 바로 해당 값 배열에 저장후 종료
        if (length == 1) {
            answer[arr[row][col]]++;
            return ;
        }

        // 현재 배열에 해당하는 모든 값이 일치하는지 확인할 flag 변수
        boolean flag = false;
        // 현재 위치의 기준 값
        int num = arr[row][col];
        // 모든 값이 일치하는지 확인
        A: for (int i = row; i < row + length; i++) {
            for (int j = col; j < col + length; j++) {
                if (arr[i][j] != num) {
                    flag = true;
                    break A;
                }
            }
        }

        // 모든 값이 일치하지 않는 경우
        if (flag) {
            // 정확히 4개로 나눠서 재귀 호출
            recursive(arr, row, col, length / 2);
            recursive(arr, row + length / 2, col, length / 2);
            recursive(arr, row, col + length / 2, length / 2);
            recursive(arr, row + length / 2, col + length / 2, length / 2);
        } else {
            // 모든 값이 일치하는 경우 해당 값 저장후 종료
            answer[num]++;
        }
    }
}
