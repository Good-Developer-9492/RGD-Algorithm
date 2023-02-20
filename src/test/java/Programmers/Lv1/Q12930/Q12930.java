package Programmers.Lv1.Q12930;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12930 {
    public static List<String> input() {
        return asList(
                "try hello world",
                "  abc de  fghi   "
        );
    }

    public static List<String> output() {
        return asList(
                "TrY HeLlO WoRlD",
                "  AbC De  FgHi   "
        );
    }
}
