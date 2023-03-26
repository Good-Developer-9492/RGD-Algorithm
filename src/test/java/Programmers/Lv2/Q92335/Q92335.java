package Programmers.Lv2.Q92335;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Q92335 {
    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            Arguments.arguments(437674, 3, 3),
            Arguments.arguments(110011, 10, 2)
        );
    }
}
