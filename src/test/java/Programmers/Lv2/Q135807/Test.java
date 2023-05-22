package Programmers.Lv2.Q135807;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            arguments(new int[]{10, 17}, new int[]{5, 20}, 0),
            arguments(new int[]{10, 20}, new int[]{5, 17}, 10),
            arguments(new int[]{14, 35, 119}, new int[]{18, 30, 102}, 7)
        );
    }
}
