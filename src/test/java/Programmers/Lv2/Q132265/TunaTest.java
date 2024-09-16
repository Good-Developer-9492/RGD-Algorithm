package Programmers.Lv2.Q132265;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfMay#Q132265")
    void solution(int[] input, int output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input));
    }
}
