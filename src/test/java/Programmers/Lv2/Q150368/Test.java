package Programmers.Lv2.Q150368;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(
                new int[][]{{40, 10000}, {25, 10000}},
                new int[]{7000, 9000},
                new int[]{1, 5400}
            ),
            Arguments.arguments(
                new int[][]{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}},
                new int[]{1300, 1500, 1600, 4900},
                new int[]{4, 13860}
            )
        );
    }
}
