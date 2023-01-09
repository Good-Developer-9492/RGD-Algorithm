package Lv1.programmers.Q12915;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12915 {
    public static List<String[]> input1() {
        return asList(
            new String[]{"sun", "bed", "car"},
            new String[]{"abce", "abcd", "cdx"}
        );
    }

    public static List<Integer> input2() {
        return asList(
            1,
            2
        );
    }

    public static List<String[]> output() {
        return asList(
            new String[]{"car", "bed", "sun"},
            new String[]{"abcd", "abce", "cdx"}
        );
    }
}
