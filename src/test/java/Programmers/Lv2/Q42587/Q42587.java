package Programmers.Lv2.Q42587;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Q42587 {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new int[]{2, 1, 3, 2}, 2, 1),
            arguments(new int[]{1, 1, 9, 1, 1, 1}, 0, 5)
        );
    }
}
