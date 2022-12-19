package Lv1.programmers.Q12935;

import java.util.Arrays;

public class Hyejin {
    //0.05ms, 76.7MB
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 1) return new int[]{-1};

        for (int j : arr) {
            if (j < min) min = j;
        }

        int[] answer = new int[arr.length - 1];


        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) continue;
            answer[index++] = arr[i];
        }

        return answer;
    }
}
