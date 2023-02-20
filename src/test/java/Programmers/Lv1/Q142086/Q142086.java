package Programmers.Lv1.Q142086;

import java.util.List;

import static java.util.Arrays.asList;

//https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class Q142086 {
    public static List<String> input() {
        return asList(
            "banana",
            "foobar"
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{-1, -1, -1, 2, 2, 2},
            new int[]{-1, -1, 1, -1, -1, -1}
        );
    }
}
