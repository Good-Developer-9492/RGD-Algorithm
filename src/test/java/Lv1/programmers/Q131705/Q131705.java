package Lv1.programmers.Q131705;

import java.util.List;

import static java.util.Arrays.asList;

public class Q131705 {
    public static List<int[]> input() {
        return asList(
            new int[] {-2, 3, 0, 2, -5},
            new int[] {-3, -2, -1, 0, 1, 2, 3},
            new int[] {-1, 1, -1, 1}
        );
    }

    public static List<Integer> output() {
        return asList(
            2,
            5,
            0
        );
    }
}
