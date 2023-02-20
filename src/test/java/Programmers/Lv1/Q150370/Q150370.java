package Programmers.Lv1.Q150370;

import java.util.List;

import static java.util.Arrays.asList;

public class Q150370 {
    public static List<String> input1() {
        return asList(
            "2022.05.19",
            "2020.01.01"
        );
    }

    public static List<String[]> input2() {
        return asList(
            new String[]{"A 6", "B 12", "C 3"},
            new String[]{"Z 3", "D 5"}
        );
    }

    public static List<String[]> input3() {
        return asList(
            new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"},
            new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}
        );
    }

    public static List<int[]> output() {
        return asList(
            new int[]{1, 3},
            new int[]{1, 4, 5}
        );
    }
}
