package Programmers.Lv2.Q87377;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(
                new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}},
                new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"}
            ),
            Arguments.arguments(
                new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}},
                new String[]{"*.*"}
            ),
            Arguments.arguments(
                new int[][]{{1, -1, 0}, {2, -1, 0}},
                new String[]{"*"}
            ),
            Arguments.arguments(
                new int[][]{{1, -1, 0}, {2, -1, 0}, {4, -1, 0}},
                new String[]{"*"}
            )
        );
    }
}
