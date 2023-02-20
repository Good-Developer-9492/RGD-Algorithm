package Programmers.Lv1.Q12950;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12950 {
    public static List<int[][]> input1() {
        return asList(
                new int[][]{{1, 2}, {2, 3}},
                new int[][]{{1}, {2}}
        );
    }

    public static List<int[][]> input2() {
        return asList(
                new int[][]{{3, 4}, {5, 6}},
                new int[][]{{3}, {4}}
        );
    }

    public static List<int[][]> output() {
        return asList(
                new int[][]{{4, 6}, {7, 9}},
                new int[][]{{4}, {6}}
        );
    }
}
