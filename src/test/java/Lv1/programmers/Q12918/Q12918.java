package Lv1.programmers.Q12918;

import java.util.List;

import static java.util.Arrays.asList;

public class Q12918 {
    public static List<String> input() {
        return asList(
                "a",
                "a234",
                "1234",
                "12345678",
                "123456"
        );
    }

    public static List<Boolean> output() {
        return asList(
                false,
                false,
                true,
                false,
                true
        );
    }
}
