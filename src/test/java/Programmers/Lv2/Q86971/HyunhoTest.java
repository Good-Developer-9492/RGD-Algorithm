package Programmers.Lv2.Q86971;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfMay#Q86971")
    void solution(int input1, int[][] input2, int output) {
        var algorithm = new Hyunho();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}