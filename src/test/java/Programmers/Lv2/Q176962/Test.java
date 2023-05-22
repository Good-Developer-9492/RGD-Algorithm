package Programmers.Lv2.Q176962;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(
                new String[][]{{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}},
                new String[]{"korean", "english", "math"}
            ),
            Arguments.arguments(
                new String[][]{{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}},
                new String[]{"science", "history", "computer", "music"}
            ),
            Arguments.arguments(
                new String[][]{{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}},
                new String[]{"bbb", "ccc", "aaa"}
            )
        );
    }
}
