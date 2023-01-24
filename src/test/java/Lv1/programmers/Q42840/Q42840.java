package Lv1.programmers.Q42840;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42840 {
    public static List<int[]> input() {
        return asList(
            new int[]{1, 2, 3, 4, 5},
            new int[]{1, 3, 2, 4, 2}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{1},
            new int[]{1, 2, 3}
        );
    }
}
