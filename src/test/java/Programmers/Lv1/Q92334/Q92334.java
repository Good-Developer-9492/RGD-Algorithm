package Programmers.Lv1.Q92334;

import java.util.List;

import static java.util.Arrays.asList;

public class Q92334 {
    public static List<String[]> input1() {
        return asList(
            new String[]{"muzi", "frodo", "apeach", "neo"},
            new String[]{"con", "ryan"}
        );
    }

    public static List<String[]> input2() {
        return asList(
            new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
            new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}
        );
    }

    public static List<Integer> input3() {
        return asList(
            2,
            3
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{2, 1, 1, 0},
            new int[]{0, 0}
        );
    }
}
