package Programmers.Lv2.Q42586;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42586 {
    public static List<int[]> input1() {
        return asList(
            new int[]{93, 30, 55},
            new int[]{95, 90, 99, 99, 80, 99}
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{1, 30, 5},
            new int[]{1, 1, 1, 1, 1, 1}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{2, 1},
            new int[]{1, 3, 2}
        );
    }
}
