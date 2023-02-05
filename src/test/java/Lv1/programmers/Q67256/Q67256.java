package Lv1.programmers.Q67256;

import java.util.List;

import static java.util.Arrays.asList;

public class Q67256 {
    public static List<int[]> input1() {
        return asList(
            new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},
            new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
        );
    }

    public static List<String> input2() {
        return asList(
            "right",
            "left",
            "right"
        );
    }

    public static List<String> output() {
        return asList(
            "LRLLLRLLRRL",
            "LRLLRRLLLRR",
            "LLRLLRLLRL"
        );
    }
}
