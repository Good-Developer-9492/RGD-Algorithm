package Programmers.Lv2.Q155651;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            arguments(new String[][]{
                    {"15:00", "17:00"},
                    {"16:40", "18:20"},
                    {"14:20", "15:20"},
                    {"14:10", "19:20"},
                    {"18:20", "21:20"}
                },
                3),
            arguments(new String[][]{
                    {"09:10", "10:10"},
                    {"10:20", "12:20"}
                },
                1),
            arguments(new String[][]{
                    {"10:20", "12:30"},
                    {"10:20", "12:30"},
                    {"10:20", "12:30"}
                },
                3)
        );
    }
}
