package Lv1.programmers.Q12682;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12682 {
    public static List<Integer> input1() {
        return asList(
            1, 2, 3, 4, 5, 6, 7
        );
    }

    public static List<String> input2() {
        return asList(
            "1S2D*3T",
            "1D2S#10S",
            "1D2S0T",
            "1S*2T*3S",
            "1D#2S*3S",
            "1T2D3D#",
            "1D2S3T*"
        );
    }

    public static List<Integer> output() {
        return asList(
            37,
            9,
            3,
            23,
            5,
            -4,
            59
        );
    }
}
