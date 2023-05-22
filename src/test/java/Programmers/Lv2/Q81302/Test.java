package Programmers.Lv2.Q81302;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            arguments(new String[][]{
                    {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                    {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                    {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                    {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                    {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
                },
                new int[]{1, 0, 1, 1, 1})
        );
    }
}
