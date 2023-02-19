package Lv2.programmers.Q12939;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12939 {
    public static List<String> input() {
        return asList(
            "1 2 3 4",
            "-1 -2 -3 -4",
            "-1 -2 -3 -4"
        );
    }


    public static List<String> output() {
        return asList(
            "1 4",
            "-4 -1",
            "-1 -1"
        );
    }
}
