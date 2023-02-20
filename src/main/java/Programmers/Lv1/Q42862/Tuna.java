package Programmers.Lv1.Q42862;

import java.util.Arrays;

public class Tuna {
    // (0.02ms, 75MB)
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1);

        for (int j : lost) {
            arr[j]--;
        }

        for (int j : reserve) {
            arr[j]++;
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > 0) {
                answer++;
                continue;
            }
            if (arr[i] == 0) {
                if (i == 1) {
                    if (arr[i + 1] == 2) {
                        arr[i + 1]--;
                        arr[i]++;
                        answer++;
                    }
                } else if (i == n) {
                    if (arr[i - 1] == 2) {
                        arr[i - 1]--;
                        arr[i]++;
                        answer++;
                    }
                } else if (arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                    answer++;
                } else if (arr[i + 1] == 2) {
                    arr[i + 1]--;
                    arr[i]++;
                    answer++;
                }
            }
        }

        return answer;
    }
}
