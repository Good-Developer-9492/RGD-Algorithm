package Programmers.Lv1.Q86491;

import java.util.List;

import static java.util.Arrays.asList;

public class Q86491 {
    public static List<int[][]> input() {
        return asList(
            new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}},
            new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}},
            new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}
        );

    }

    public static List<Integer> output() {
        return asList(
            4000,
            120,
            133
        );
    }
}
