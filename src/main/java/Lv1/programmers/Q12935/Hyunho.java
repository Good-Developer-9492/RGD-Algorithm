package Lv1.programmers.Q12935;

import java.util.Arrays;

public class Hyunho {
    //3.65ms, 97MB
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minNumber = Arrays.stream(arr).min().getAsInt();
        int[] answer = new int[arr.length - 1];

        int index = 0;

        for (int number : arr) {
            if (minNumber != number) {
                answer[index++] = number;
            }
        }

        return answer;
    }
}
