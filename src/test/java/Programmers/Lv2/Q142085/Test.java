package Programmers.Lv2.Q142085;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1}, 5),
            Arguments.arguments(2, 4, new int[]{3, 3, 3, 3}, 4)
        );
    }
}
