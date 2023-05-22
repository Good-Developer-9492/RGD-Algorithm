package Programmers.Lv2.Q148653;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            arguments(16, 6),
            arguments(2554, 16)
        );
    }
}
