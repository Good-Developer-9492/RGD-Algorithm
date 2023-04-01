package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FirstWeekOfApril {
    public static Stream<Arguments> Q87946() {
        return Stream.of(
            Arguments.arguments(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}, 3)
        );
    }

    public static Stream<Arguments> Q131127() {
        return Stream.of(
            Arguments.arguments(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"},
                3
            ),
            Arguments.arguments(
                new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"},
                0
            )
        );
    }

    public static Stream<Arguments> Q17684() {
        return Stream.of(
            Arguments.arguments("KAKAO", new int[]{11, 1, 27, 15}),
            Arguments.arguments("TOBEORNOTTOBEORTOBEORNOT", new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34}),
            Arguments.arguments("ABABABABABABABAB",	new int[]{1, 2, 27, 29, 28, 31, 30})
        );
    }

    public static Stream<Arguments> Q17687() {
        return Stream.of(
            Arguments.arguments(2, 4, 2, 1, "0111"),
            Arguments.arguments(16, 16, 2, 1, "02468ACE11111111"),
            Arguments.arguments(16, 16, 2, 2, "13579BDF01234567")
        );
    }

    public static Stream<Arguments> Q92341() {
        return Stream.of(
            Arguments.arguments(
                new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"},
                new int[]{14600, 34400, 5000}
            ),
            Arguments.arguments(
                new int[]{120, 0, 60, 591},
                new String[]{"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"},
                new int[]{0, 591}
            ),
            Arguments.arguments(
                new int[]{1, 461, 1, 10},
                new String[]{"00:00 1234 IN"},
                new int[]{14841}
            )
        );
    }

    public static Stream<Arguments> Q42626() {
        return Stream.of(
            Arguments.arguments(new int[]{1, 2, 3, 9, 10, 12}, 7, 2)
        );
    }
}
