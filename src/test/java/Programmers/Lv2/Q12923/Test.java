package Programmers.Lv2.Q12923;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(1L, 10L, new int[]{0, 1, 1, 2, 1, 3, 1, 4, 3, 5})
        );
    }
}
