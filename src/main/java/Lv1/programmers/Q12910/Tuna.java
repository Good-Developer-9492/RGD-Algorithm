package Lv1.programmers.Q12910;

import java.util.Arrays;

public class Tuna {
    // (3ms, 77MB)
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();

        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}
