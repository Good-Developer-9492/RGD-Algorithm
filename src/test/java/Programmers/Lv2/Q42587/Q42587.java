package Programmers.Lv2.Q42587;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42587 {
    public static List<int[]> input1() {
        return asList(
            new int[]{2, 1, 3, 2},
            new int[]{1, 1, 9, 1, 1, 1}
        );
    }

    public static List<Integer> input2() {
        return asList(
            2,
            0
        );
    }

    public static List<Integer> output() {
        return asList(
            1,
            5
        );
    }
}
