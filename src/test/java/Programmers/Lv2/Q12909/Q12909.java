package Programmers.Lv2.Q12909;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12909 {
    public static List<String> input() {
        return asList(
            "()()",
            "(())()",
            ")()(",
            "(()("
        );
    }

    public static List<Boolean> output() {
        return asList(
            true,
            true,
            false,
            false
        );
    }
}
