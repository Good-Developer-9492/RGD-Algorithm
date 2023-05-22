package Programmers.Lv2.Q152996;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(new int[]{100, 180, 360, 100, 270}, 4L)
        );
    }
}
