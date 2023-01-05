package Lv1.programmers.Q12926;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12926 {
    public static List<String> input1() {
        return asList(
            "AB",
            "z",
            "a B z",
            "   ",
            "ZZZ"
        );
    }

    public static List<Integer> input2() {
        return asList(
            1,
            1,
            4,
            1,
            2
        );
    }

    public static List<String> output() {
        return asList(
            "BC",
            "a",
            "e F d",
            "   ",
            "BBB"
        );
    }
}
