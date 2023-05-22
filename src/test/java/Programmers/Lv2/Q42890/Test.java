package Programmers.Lv2.Q42890;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(new String[][]{
                    {"100", "ryan", "music", "2"},
                    {"200", "apeach", "math", "2"},
                    {"300", "tube", "computer", "3"},
                    {"400", "con", "computer", "4"},
                    {"500", "muzi", "music", "3"},
                    {"600", "apeach", "music", "2"}
                },
                2)
        );
    }
}
