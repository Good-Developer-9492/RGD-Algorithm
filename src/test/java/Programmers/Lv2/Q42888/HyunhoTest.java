package Programmers.Lv2.Q42888;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfApril#Q42888")
    void solution(String[] input, String[] result) {
        var algorithm = new Hyunho();
        Assertions.assertArrayEquals(result, algorithm.solution(input));
    }
}