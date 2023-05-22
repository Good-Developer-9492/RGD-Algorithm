package Programmers.Lv2.Q131130;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(new int[]{8, 6, 3, 7, 2, 5, 1, 4}, 12)
        );
    }
}
