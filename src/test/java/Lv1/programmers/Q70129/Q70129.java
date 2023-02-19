package Lv1.programmers.Q70129;

import java.util.List;

import static java.util.Arrays.asList;

public class Q70129 {
    public static List<String> input() {
        return asList(
            "110010101001",
            "01110",
            "1111111"
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{3, 8},
            new int[]{3, 3},
            new int[]{4, 1}
        );
    }
}
