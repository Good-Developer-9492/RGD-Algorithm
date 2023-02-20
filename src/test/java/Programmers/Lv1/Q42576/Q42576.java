package Programmers.Lv1.Q42576;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42576 {
    public static List<String[]> input1() {
        return asList(
            new String[]{"leo", "kiki", "eden"},
            new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
            new String[]{"mislav", "stanko", "mislav", "ana"}
        );
    }

    public static List<String[]> input2() {
        return asList(
            new String[]{"eden", "kiki"},
            new String[]{"josipa", "filipa", "marina", "nikola"},
            new String[]{"stanko", "ana", "mislav"}
        );
    }

    public static List<String> output() {
        return asList(
            "leo",
            "vinko",
            "mislav"
        );
    }
}
