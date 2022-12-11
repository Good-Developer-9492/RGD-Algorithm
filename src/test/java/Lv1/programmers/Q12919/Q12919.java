package Lv1.programmers.Q12919;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12919 {
    public static List<String[]> input() {
        return asList(
            new String[]{"Jane","Kim"},
            new String[]{"Kim","Jane"}
        );
    }

    public static List<String> output() {
        return asList(
            "김서방은 1에 있다",
            "김서방은 0에 있다"
        );
    }
}
