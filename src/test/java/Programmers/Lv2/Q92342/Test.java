package Programmers.Lv2.Q92342;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(
                5,
                new int[]{2,1,1,1,0,0,0,0,0,0,0},
                new int[]{0,2,2,0,1,0,0,0,0,0,0}
            ),
            Arguments.arguments(
                1,
                new int[]{1,0,0,0,0,0,0,0,0,0,0},
                new int[]{-1}
            ),
            Arguments.arguments(
                9,
                new int[]{0,0,1,2,0,1,1,1,1,1,1},
                new int[]{1,1,2,0,1,2,2,0,0,0,0}
            ),
            Arguments.arguments(
                10,
                new int[]{0,0,0,0,0,0,0,0,3,4,3},
                new int[]{1,1,1,1,1,1,1,1,0,0,2}
            )
        );
    }
}
