package Programmers.Lv2.Q42746;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FourthWeekOfApril#Q42746")
    void solution(int[] input, String output) {
        var algorithm = new Hyunho();
        Assertions.assertEquals(output, algorithm.solution(input));
    }
}