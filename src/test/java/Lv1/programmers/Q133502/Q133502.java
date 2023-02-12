package Lv1.programmers.Q133502;

import java.util.List;

import static java.util.Arrays.asList;

public class Q133502 {
    public static List<int[]> input() {
        return asList(
            new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1},
            new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}
        );
    }

    public static List<Integer> output() {
        return asList(
            2,
            0
        );
    }
}
