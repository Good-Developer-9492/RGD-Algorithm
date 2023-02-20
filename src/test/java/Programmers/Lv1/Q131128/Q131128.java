package Programmers.Lv1.Q131128;

import java.util.List;

import static java.util.Arrays.asList;

public class Q131128 {
    public static List<String> input1() {
        return asList(
            "100",
            "100",
            "100",
            "12321",
            "5525"
        );
    }

    public static List<String> input2() {
        return asList(
            "2345",
            "203045",
            "123450",
            "42531",
            "1255"
        );
    }

    public static List<String> output() {
        return asList(
            "-1",
            "0",
            "10",
            "321",
            "552"
        );
    }
}
