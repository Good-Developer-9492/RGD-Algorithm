package Programmers.Lv2.Q159993;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(new String[]{"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"}, 16),
            Arguments.arguments(new String[]{"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"}, -1)
        );
    }
}
