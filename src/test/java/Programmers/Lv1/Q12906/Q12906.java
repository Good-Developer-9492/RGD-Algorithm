package Programmers.Lv1.Q12906;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12906 {
    public static List<int[]> input() {
        return asList(
                new int[]{1, 1, 3, 3, 0, 1, 1},
                new int[]{4, 4, 4, 3, 3}
        );
    }

    public static List<int[]> output() {
        return asList(
                new int[]{1, 3, 0, 1},
                new int[]{4, 3}
        );
    }
}
