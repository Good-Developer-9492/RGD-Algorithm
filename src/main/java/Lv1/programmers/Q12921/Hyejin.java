package Lv1.programmers.Q12921;

public class Hyejin {
    //0.06ms, 74.5MB
    public int solution(int n) {
        int[] arr = new int[n + 1];
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                removeNum(arr, i, n);
            }
        }
        return answer;
    }

    private void removeNum(int[] arr, int start, int end) {
        for (int j = start; j <= end; j += start) {
            arr[j] = 1;
        }
    }
}
