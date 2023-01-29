package Lv1.programmers.Q42862;

import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/42862
import static java.util.Arrays.asList;

public class Q42862 {
    public static List<Integer> input1() {
        return asList(
            5,
            5,
            3
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{2, 4},
            new int[]{2, 4},
            new int[]{3}
        );
    }

    public static List<int[]> input3() {
        return asList(
            new int[]{1, 3, 5},
            new int[]{3},
            new int[]{1}
        );
    }

    public static List<Integer> output() {
        return asList(
            5,
            4,
            2
        );
    }
}
