package Programmers.Lv2.Q42842;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42842 {
    public static List<Integer> input1() {
        return asList(
            10,
            8,
            24
        );
    }

    public static List<Integer> input2() {
        return asList(
            2,
            1,
            24
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{4, 3},
            new int[]{3, 3},
            new int[]{8, 6}
        );
    }
}
