package Programmers.Lv1.Q12954;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12954 {
    public static List<Integer> input_1() {
        return asList(
            2,
            4,
            -4,
            10000000
        );
    }

    public static List<Integer> input_2() {
        return asList(
            5,
            3,
            2,
            1000
        );
    }

    public static List<long[]> output() {
        return asList(
            new long[]{2, 4, 6, 8, 10},
            new long[]{4, 8, 12},
            new long[]{-4, -8},
            testcase()
        );
    }

    private static long[] testcase() {
        long[] test = new long[1000];

        for (int i = 0; i < 1000; i++) {
            test[i] = 10000000L * (i + 1);
        }

        return test;
    }
}
