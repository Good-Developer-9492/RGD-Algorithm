package Programmers.Lv2.Q134239;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(5, new int[][]{{0, 0}, {0, -1}, {2, -3}, {3, -3}}, new double[]{33.0, 31.5, 0.0, -1.0})
        );
    }
}
