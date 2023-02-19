package Lv1.programmers.Q159994;

import java.util.List;

import static java.util.Arrays.asList;

public class Q159994 {
    public static List<String[]> input1() {
        return asList(
            new String[]{"i", "drink", "water"},
            new String[]{"i", "water", "drink"}
        );
    }

    public static List<String[]> input2() {
        return asList(
            new String[]{"want", "to"},
            new String[]{"want", "to"}
            );
    }

    public static List<String[]> input3() {
        return asList(
            new String[] {"i", "want", "to", "drink", "water"},
            new String[] {"i", "want", "to", "drink", "water"}
        );
    }


    public static List<String> output() {
        return asList(
            "Yes",
            "No"
        );
    }
}
