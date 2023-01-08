package Lv1.programmers.Q42748;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42748 {
    public static List<int[]> input1() {
        return asList(
            new int[]{1, 5, 2, 6, 3, 7, 4}
        );
    }

    public static List<int[][]> input2() {
        return asList(
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}},
            new int[][]{{0}}
        );
    }


    public static List<int[]> output() {
        return asList(
            new int[]{5, 6, 3}
        );
    }
}
