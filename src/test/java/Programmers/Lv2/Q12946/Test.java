package Programmers.Lv2.Q12946;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(2, new int[][]{{1, 2}, {1, 3}, {2, 3}})
        );
    }
}
