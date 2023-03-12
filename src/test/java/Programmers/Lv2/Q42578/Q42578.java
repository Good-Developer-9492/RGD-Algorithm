package Programmers.Lv2.Q42578;

import java.util.List;

import static java.util.Arrays.asList;

public class Q42578 {
    public static List<String[][]> input1() {
        return asList(
            new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}},
            new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}
        );
    }

    public static List<Integer> output() {
        return asList(
            5, 3
        );
    }
}
