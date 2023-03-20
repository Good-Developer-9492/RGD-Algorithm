package Programmers.Lv2.Q64065;

import java.util.List;

import static java.util.Arrays.asList;

public class Q64065 {
    public static List<String> input() {
        return asList(
            "{{2},{2,1},{2,1,3},{2,1,3,4}}",
            "{{1,2,3},{2,1},{1,2,4,3},{2}}",
            "{{20,111},{111}}",
            "{{123}}",
            "{{4,2,3},{3},{2,3,4,1},{2,3}}"
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{2, 1, 3, 4},
            new int[]{2, 1, 3, 4},
            new int[]{111, 20},
            new int[]{123},
            new int[]{3, 2, 4, 1}
        );
    }
}
