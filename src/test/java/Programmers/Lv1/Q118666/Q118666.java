package Programmers.Lv1.Q118666;

import java.util.List;

import static java.util.Arrays.asList;

public class Q118666 {
    public static List<String[]> input1() {
        return asList(
            new String[]{"AN", "CF", "MJ", "RT", "NA"},
            new String[]{"TR", "RT", "TR"}
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{5, 3, 2, 7, 5},
            new int[]{7, 1, 3}
        );
    }

    public static List<String> output() {
        return asList(
            "TCMA",
            "RCJA"
        );
    }
}
