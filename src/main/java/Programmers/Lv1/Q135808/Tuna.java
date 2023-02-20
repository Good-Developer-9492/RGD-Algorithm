package Programmers.Lv1.Q135808;

import java.util.Arrays;

import static java.util.Collections.reverseOrder;

public class Tuna {
    // (2.56ms ~ 269.15ms / 65.5MB ~ 149MB)
    public int solution(int k, int m, int[] score) {
        int[] arr = Arrays.stream(score).boxed().sorted(reverseOrder()).mapToInt(Integer::intValue).toArray();

        int answer = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            count++;
            min = Math.min(min, num);

            if (count == m) {
                answer += min * m;
                count = 0;
                min = Integer.MAX_VALUE;
            }
        }

        return answer;
    }
}
