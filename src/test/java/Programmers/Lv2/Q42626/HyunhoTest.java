package Programmers.Lv2.Q42626;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfApril#Q42626")
    void solution(int[] input1, int input2, int result) {
        var algorithm = new Hyunho();
        Assertions.assertEquals(result, algorithm.solution(input1, input2));
    }
}