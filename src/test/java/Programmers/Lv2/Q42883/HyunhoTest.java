package Programmers.Lv2.Q42883;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfMay#Q42883")
    void solution(String input1, int input2, String output) {
        var algorithm = new Hyunho();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}