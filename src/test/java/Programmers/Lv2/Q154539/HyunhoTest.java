package Programmers.Lv2.Q154539;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FourthWeekOfApril#Q154539")
    void solution(int[] input, int[] output) {
        var algorithm = new Hyunho();
        Assertions.assertArrayEquals(output, algorithm.solution(input));
    }
}