package Programmers.Lv2.Q12899;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfMay#Q12899")
    void solution(int input, String output) {
        var algorithm = new Hyunho();
        assertEquals(output, algorithm.solution(input));
    }
}