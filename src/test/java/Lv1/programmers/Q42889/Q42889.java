package Lv1.programmers.Q42889;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42889 {
    public static List<Integer> input1() {
        return asList(
            5,
            4
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{2, 1, 2, 6, 2, 4, 3, 3},
            new int[]{4, 4, 4, 4, 4}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{3, 4, 2, 1, 5},
            new int[]{4, 1, 2, 3}
        );
    }
}
