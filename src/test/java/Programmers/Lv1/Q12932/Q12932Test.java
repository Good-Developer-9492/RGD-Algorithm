package Programmers.Lv1.Q12932;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12932Test {
    public static List<Long> input() {
        return asList(
            12345L,
            10000000000L,
            1234567890L,
            1L
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{5, 4, 3, 2, 1},
            new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1},
            new int[]{1}
        );
    }
}
