package Programmers.Lv2.Q68936;

public class Hyunho {
    //25.31ms, 110MB
    public int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        position(arr, 0, 0, arr.length);

        return answer;
    }

    public void position(int[][] arr, int x, int y, int size) {

        if (size == 1) {
            int num = arr[x][y];
            answer[num]++;
            return;
        }

        // 같은 수 확인
        if (check(arr, x, y, size)) {
            return;
        }

        int newSize = size / 2;

        position(arr, x, y, newSize);
        position(arr, x, y + newSize, newSize);
        position(arr, x + newSize, y, newSize);
        position(arr, x + newSize, y + newSize, newSize);
    }

    public boolean check(int[][] arr, int x, int y, int size) {
        boolean temp = true;
        int num = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (num != arr[i][j]) {
                    temp = false;
                    break;
                }
            }
        }

        if (temp) {
            answer[num]++;
        }

        return temp;
    }
}
