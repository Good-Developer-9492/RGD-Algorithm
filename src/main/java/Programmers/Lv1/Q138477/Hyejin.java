package Programmers.Lv1.Q138477;

import java.util.Arrays;

public class Hyejin {
    //1.11ms, 72.8MB
    //12.21ms, 81.1MB
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] daily = new int[k];
        Arrays.fill(daily, -1);

        int minIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < score.length; i++) {
            int s = score[i];

            if (i <= k - 1) daily[i] = s;

            else if (s > min) daily[minIndex] = s;

            minIndex = getMinIndex(daily);
            min = daily[minIndex];
            answer[i] = min;

        }
        return answer;
    }

    private int getMinIndex(int[] daily) {
        int min = Arrays.stream(daily).filter(a -> a != -1).min().orElse(-1);
        for (int i = 0; i < daily.length; i++)
            if (daily[i] == min) return i;
        return -1;
    }

}
