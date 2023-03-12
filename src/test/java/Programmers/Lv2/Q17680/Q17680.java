package Programmers.Lv2.Q17680;

import java.util.List;

import static java.util.Arrays.asList;

public class Q17680 {

    public static List<Integer> input1() {
        return asList(
            3,
            3,
            2,
            5,
            2,
            0
        );
    }

    public static List<String[]> input2() {
        return asList(

            new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"},
            new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"},
            new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
            new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
            new String[]{"Jeju", "Pangyo", "NewYork", "newyork"},
            new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}

        );
    }

    public static List<Integer> output() {
        return asList(
            50, 21, 60, 52, 16, 25
        );
    }
}




