package Programmers.Lv2.Q13876;

import java.util.List;

import static java.util.Arrays.asList;

public class Q13876 {
    public static List<Integer> input() {
        return asList(
            6, 4, 2
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{1, 3, 2, 5, 4, 5, 2, 3},
            new int[]{1, 3, 2, 5, 4, 5, 2, 3},
            new int[]{1, 1, 1, 1, 2, 2, 2, 3}

        );
    }

    public static List<Integer> output() {
        return asList(
            3, 2, 1
        );
    }
}
