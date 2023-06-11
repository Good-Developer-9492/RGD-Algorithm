package Programmers.Lv2.Q12936;

import java.util.ArrayList;
import java.util.List;

public class Tuna {
    // (0.05ms / 75MB)
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        List<Integer> list = new ArrayList<>();
        // 전체 경우의 수
        long all = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            all *= i;
        }

        // 배열에 맞게 index 하나 줄이기
        k--;
        // answer 배열에 사용할 idx
        int idx = 0;
        while (n > 0) {
            all /= n;
            answer[idx++] = list.remove((int) (k / all));

            k %= all;
            n--;
        }

        return answer;
    }
}
