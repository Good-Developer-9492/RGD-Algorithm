package Programmers.Lv1.Q64061;

import java.util.List;

import static java.util.Arrays.asList;

public class Q64061 {
    public static List<int[][]> input1() {
        return asList(
            new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
            },
            new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 4, 4, 0},
                {1, 2, 2, 1}
            }
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{1, 5, 3, 5, 1, 2, 1, 4},
            new int[]{1, 2, 3, 4},
            new int[]{2, 3, 1, 4, 2, 3}
        );
    }

    public static List<Integer> output() {
        return asList(
            4,
            0,
            6
        );
    }
}
