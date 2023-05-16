package Programmers.Lv2.Q154540;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfMay#Q154540")
    void solution(String[] input, int[] output) {
        var algorithm = new Hyunho();
        assertArrayEquals(output, algorithm.solution(input));
    }
}