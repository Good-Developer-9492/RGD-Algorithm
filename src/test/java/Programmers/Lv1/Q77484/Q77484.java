package Programmers.Lv1.Q77484;

import java.util.List;

import static java.util.Arrays.asList;

//https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class Q77484 {
    public static List<int[]> input1() {
        return asList(
            new int[]{44, 1, 0, 0, 31, 25},
            new int[]{0, 0, 0, 0, 0, 0},
            new int[]{45, 4, 35, 20, 3, 9}
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{31, 10, 45, 1, 6, 19},
            new int[]{38, 19, 20, 40, 15, 25},
            new int[]{20, 9, 3, 45, 4, 35}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{3, 5},
            new int[]{1, 6},
            new int[]{1, 1}
        );
    }
}
