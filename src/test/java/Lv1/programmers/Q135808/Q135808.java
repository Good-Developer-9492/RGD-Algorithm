package Lv1.programmers.Q135808;

import java.util.List;

import static java.util.Arrays.asList;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Q135808 {
    public static List<Integer> input1() {
        return asList(
            3,
            4
        );
    }

    public static List<Integer> input2() {
        return asList(
            4,
            3
        );
    }

    public static List<int[]> input3() {
        return asList(
            new int[]{1, 2, 3, 1, 2, 3, 1},
            new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}
        );
    }

    public static List<Integer> output() {
        return asList(
            8,
            33
        );
    }
}
