package Lv1.programmers.Q70128;

import java.util.List;

import static java.util.Arrays.asList;

public class Q70128 {
    public static List<int[]> input1() {
        return asList(
            new int[]{1, 2, 3, 4},
            new int[]{-1, 0, 1}
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{-3, -1, 0, 2},
            new int[]{1, 0, -1}
        );
    }

    public static List<Integer> output() {
        return asList(
            3,
            -2
        );
    }
}
