package Programmers.Lv2.Q68936;

public class Hyejin {
    int[] answer;

    public int[] solution(int[][] arr) {
        answer = new int[2];
        quad(arr.length, 0, 0, arr);
        return answer;
    }

    private void quad(int n, int y, int x, int[][] arr) {
        //가장 작게 쪼개졌을 때
        if (n == 1) {
            //해당 값 증가
            answer[arr[y][x]]++;
            return;
        }

        //쪼갠 부분의 값이 같다면 나오기
        if (isBlock(n, y, x, arr)) return;

        //1/4 로 쪼개기
        quad(n / 2, y, x, arr);
        quad(n / 2, y + (n / 2), x, arr);
        quad(n / 2, y, x + (n / 2), arr);
        quad(n / 2, y + (n / 2), x + (n / 2), arr);

    }

    private boolean isBlock(int n, int y, int x, int[][] arr) {
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                //하나라도 다른 값이 있다면 false
                if (arr[y][x] != arr[i][j]) {
                    return false;
                }
            }
        }
        //전부다 같은 숫자일 경우
        answer[arr[y][x]]++;
        return true;
    }
}


