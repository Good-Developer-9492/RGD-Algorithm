package Programmers.Lv2.Q42860;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments("JEROEN", 56),
            Arguments.arguments("JAN", 23)
        );
    }
}
