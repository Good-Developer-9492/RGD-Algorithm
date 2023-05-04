package Programmers.Lv2.Q68645;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfMay#Q68645")
    void solution(int input, int[] output) {
        var algorithm = new Hyunho();
        assertArrayEquals(output, algorithm.solution(input));
    }
}