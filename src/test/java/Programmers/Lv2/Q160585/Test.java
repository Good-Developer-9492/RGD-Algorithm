package Programmers.Lv2.Q160585;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(new String[]{"O.X", ".O.", "..X"}, 1),
            Arguments.arguments(new String[]{"OOO", "...", "XXX"}, 0),
            Arguments.arguments(new String[]{"...", ".X.", "..."}, 0),
            Arguments.arguments(new String[]{"...", "...", "..."}, 1)
        );
    }
}
