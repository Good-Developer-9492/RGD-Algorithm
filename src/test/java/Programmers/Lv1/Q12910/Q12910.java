package Programmers.Lv1.Q12910;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12910 {
    public static List<int[]> input1() {
        return asList(
            new int[]{5, 9, 7, 10},
            new int[]{2, 36, 1, 3},
            new int[]{3, 2, 6}
        );
    }

    public static List<Integer> input2() {
        return asList(
            5,
            1,
            10
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{5, 10},
            new int[]{1, 2, 3, 36},
            new int[]{-1}
        );
    }
}
