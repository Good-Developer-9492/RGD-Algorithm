package Programmers.Lv2.Q140107;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            arguments(2, 4, 6L),
            arguments(1, 5, 26L)
        );
    }
}
