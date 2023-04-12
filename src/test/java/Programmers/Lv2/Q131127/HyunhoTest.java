package Programmers.Lv2.Q131127;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfApril#Q131127")
    void solution(String[] input1, int[] input2, String[] input3, int result) {
        var algorithm = new Hyunho();
        Assertions.assertEquals(result, algorithm.solution(input1, input2, input3));
    }

}