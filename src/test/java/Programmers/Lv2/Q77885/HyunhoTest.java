package Programmers.Lv2.Q77885;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FourthWeekOfApril#Q77885")
    void solution(long[] input, long[] output) {
        var algorithm = new Hyunho();
        assertArrayEquals(output, algorithm.solution(input));
    }
}