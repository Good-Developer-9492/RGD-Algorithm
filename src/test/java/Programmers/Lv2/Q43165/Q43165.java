package Programmers.Lv2.Q43165;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Q43165 {
    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new int[]{1, 1, 1, 1, 1}, 3, 5),
            arguments(new int[]{4, 1, 2, 1}, 4, 2)
        );
    }
}
