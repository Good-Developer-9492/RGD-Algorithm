package Lv1.programmers.Q12944;

import java.util.Arrays;

public class Hyejin {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0.0);
    }
}
