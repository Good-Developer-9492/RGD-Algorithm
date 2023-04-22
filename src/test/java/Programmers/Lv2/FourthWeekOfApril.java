package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FourthWeekOfApril {
    public static Stream<Arguments> Q154539() {
        return Stream.of(
            Arguments.arguments(new int[]{2, 3, 3, 5}, new int[]{3, 5, 5, -1}),
            Arguments.arguments(new int[]{9, 1, 5, 3, 6, 2}, new int[]{-1, 5, 6, 6, -1, -1})
        );
    }

    public static Stream<Arguments> Q77885() {
        return Stream.of(
            Arguments.arguments(new int[]{2, 7}, new int[]{3, 11})
        );
    }

    public static Stream<Arguments> Q42583() {
        return Stream.of(
            Arguments.arguments(2, 10, new int[]{7, 4, 5, 6}, 8),
            Arguments.arguments(100, 100, new int[]{10}, 101),
            Arguments.arguments(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 110)
        );
    }

    public static Stream<Arguments> Q42746() {
        return Stream.of(
            Arguments.arguments(new int[]{6, 10, 2}, "6210"),
            Arguments.arguments(new int[]{3, 30, 34, 5, 9}, "9534330")
        );
    }

    public static Stream<Arguments> Q42839() {
        return Stream.of(
            Arguments.arguments("17", 3),
            Arguments.arguments("011", 2)
        );
    }

    public static Stream<Arguments> Q154538() {
        return Stream.of(
            Arguments.arguments(10, 40, 5, 2),
            Arguments.arguments(10, 40, 30, 1),
            Arguments.arguments(2, 5, 4, -1)
        );
    }
}
