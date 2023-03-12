package Programmers.Lv2.Q76502;

import java.util.List;

import static java.util.Arrays.asList;

public class Q76502 {
    public static List<String> input() {
        return asList(
            "[](){}",
            "}]()[{",
            "[)(]",
            "}}}"
        );
    }

    public static List<Integer> output() {
        return asList(
            3, 2, 0, 0
        );
    }
}
