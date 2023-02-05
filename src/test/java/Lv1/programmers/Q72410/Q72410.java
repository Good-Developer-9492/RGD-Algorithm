package Lv1.programmers.Q72410;

import java.util.List;

import static java.util.Arrays.asList;

public class Q72410 {
    public static List<String> input() {
        return asList(
            "...!@BaT#*..y.abcdefghijklm",
            "z-+.^.",
            "=.=",
            "123_.def",
            "abcdefghijklmn.p"
        );
    }

    public static List<String> output() {
        return asList(
            "bat.y.abcdefghi",
            "z--",
            "aaa",
            "123_.def",
            "abcdefghijklmn"
        );
    }
}
