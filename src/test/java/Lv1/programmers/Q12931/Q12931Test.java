package Lv1.programmers.Q12931;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12931Test {
    public static List<Integer> input() {
        return asList(
            123,
            987,
            1,
            100000000,
            99999999
        );
    }

    public static List<Integer> output() {
        return asList(
            6,
            24,
            1,
            1,
            72
        );
    }
}

