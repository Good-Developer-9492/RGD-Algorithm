package Programmers.Lv2.Q12981;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12981 {
    public static List<Integer> input1() {
        return asList(
            3,
            5,
            2
        );
    }

    public static List<String[]> input2() {
        return asList(
            new String[]{
                "tank", "kick", "know",
                "wheel", "land", "dream",
                "mother", "robot", "tank"
            },
            new String[]{
                "hello", "observe", "effect",
                "take", "either", "recognize",
                "encourage", "ensure", "establish",
                "hang", "gather", "refer",
                "reference", "estimate", "executive"
            },
            new String[]{
                "hello", "one", "even",
                "never", "now", "world",
                "draw"
            }
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{3, 3},
            new int[]{0, 0},
            new int[]{1, 3}
        );
    }
}
