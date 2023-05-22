package Programmers.Lv2.Q60057;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            arguments("aabbaccc", 7),
            arguments("ababcdcdababcdcd", 9),
            arguments("abcabcdede", 8),
            arguments("abcabcabcabcdededededede", 14),
            arguments("xababcdcdababcdcd", 17)
        );
    }
}
