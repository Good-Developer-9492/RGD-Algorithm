package Programmers.Lv1.Q1845;

import java.util.List;

import static java.util.Arrays.asList;

public class Q1845 {
    public static List<int[]> input() {
        return asList(
            new int[]{ 3, 1, 2, 3 },
            new int[]{ 3, 3, 3, 2, 2, 4 },
            new int[]{ 3, 3, 3, 2, 2, 2 }
        );
    }

    public static List<Integer> output() {
        return asList(
            2,
            3,
            2
        );
    }
}
