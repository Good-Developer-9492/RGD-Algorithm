package Programmers.Lv1.Q12944;

import java.util.Arrays;

public class Hyunho {
    public double solution(int[] arr) {
        double sum = Arrays.stream(arr).sum();
        double answer = sum / arr.length;

        return answer;
    }
}
