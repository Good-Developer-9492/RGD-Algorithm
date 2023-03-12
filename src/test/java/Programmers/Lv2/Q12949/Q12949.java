package Programmers.Lv2.Q12949;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12949 {
    public static List<int[][]> input() {
        return asList(
            new int[][]{{1, 4}, {3, 2}, {4, 1}},
            new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}
        );
    }

    public static List<int[][]> input2() {
        return asList(
            new int[][]{{3, 3}, {3, 3}},
            new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})
            ;
    }

    public static List<int[][]> output() {
        return asList(
            new int[][]{{15, 15}, {15, 15}, {15, 15}},
            new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}
        );
    }
}
