package Lv1.programmers.Q42862;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42862 {
    public static List<Integer> input1() {
        return asList(
            5,
            5,
            3,
            5,
            7,
            3,
            13
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{2, 4},
            new int[]{2, 4},
            new int[]{3},
            new int[]{2,4},
            new int[]{2,4,7},
            new int[]{1,2,3},
            new int[]{1, 2, 5, 6, 10, 12, 13}
        );
    }

    public static List<int[]> input3() {
        return asList(
            new int[]{1, 3, 5},
            new int[]{3},
            new int[]{1},
            new int[]{3,5},
            new int[]{1,3,5},
            new int[]{},
            new int[]{2, 3, 4, 5, 7, 8, 9, 10, 11, 12}

        );
    }

    public static List<Integer> output() {
        return asList(
            5,
            4,
            2,
            5,
            6,
            0,
            11
        );
    }
}
