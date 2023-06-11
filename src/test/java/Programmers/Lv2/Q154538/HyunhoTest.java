package Programmers.Lv2.Q154538;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FourthWeekOfApril#Q154538")
    void solution(int input1, int input2, int input3, int output) {
        var algorithm = new Hyunho();
        Assertions.assertEquals(output, algorithm.solution(input1, input2, input3));
    }
}