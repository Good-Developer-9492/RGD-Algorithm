package Lv1.programmers.Q68644;

import java.util.List;

import static java.util.Arrays.asList;

public class Q68644 {
    public static List<int[]> input() {
        return asList(
            new int[]{2, 1, 3, 4, 1},
            new int[]{5, 0, 2, 7}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{2, 3, 4, 5, 6, 7},
            new int[]{2, 5, 7, 9, 12}
        );
    }
}
