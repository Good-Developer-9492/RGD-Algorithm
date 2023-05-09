package Programmers.Lv2.Q118667;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfMay#Q118667")
    void solution(int[] input1, int[] input2, int output) {
        var algorithm = new Hyunho();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}