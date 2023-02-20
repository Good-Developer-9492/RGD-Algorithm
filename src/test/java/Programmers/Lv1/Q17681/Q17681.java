package Programmers.Lv1.Q17681;

import java.util.List;

import static java.util.Arrays.asList;

public class Q17681 {
    public static List<Integer> input1() {
        return asList(
            5,
            6
        );
    }

    public static List<int[]> input2() {
        return asList(
            new int[]{9, 20, 28, 18, 11},
            new int[]{46, 33, 33, 22, 31, 50}
        );
    }

    public static List<int[]> input3() {
        return asList(
            new int[]{30, 1, 21, 17, 28},
            new int[]{27, 56, 19, 14, 14, 10}
        );
    }

    public static List<String[]> output() {
        return asList(
            new String[]{"#####", "# # #", "### #", "#  ##", "#####"},
            new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}
        );
    }
}
