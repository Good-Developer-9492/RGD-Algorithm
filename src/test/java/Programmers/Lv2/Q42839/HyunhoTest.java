package Programmers.Lv2.Q42839;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FourthWeekOfApril#Q42839")
    void solution(String input, int output) {
        var algorithm = new Hyunho();
        Assertions.assertEquals(output, algorithm.solution(input));
    }
}