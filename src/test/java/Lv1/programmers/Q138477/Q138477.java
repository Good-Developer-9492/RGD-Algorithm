package Lv1.programmers.Q138477;

import java.util.List;

import static java.util.Arrays.asList;

//https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class Q138477 {
    public static List<Integer> input1() {
        return asList(
            3,
            4
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{10, 100, 20, 150, 1, 100, 200},
            new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{10, 10, 10, 20, 20, 100, 100},
            new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300}
        );
    }
}
