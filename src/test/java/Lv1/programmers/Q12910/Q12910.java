package Lv1.programmers.Q12910;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12910 {
    public static List<Integer[]> input1() {
        return asList(
            new Integer[]{5, 9, 7, 10},
            new Integer[]{2, 36, 1, 3},
            new Integer[]{3, 2, 6}
        );
    }

    public static List<Integer> input2() {
        return asList(
            5,
            1,
            10
        );
    }

    public static List<Integer[]> output() {
        return asList(
            new Integer[]{5, 10},
            new Integer[]{1, 2, 3, 36},
            new Integer[]{-1}
        );
    }
}
