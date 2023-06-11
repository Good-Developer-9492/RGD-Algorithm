package Programmers.Lv2.Q131704;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfMay#Q131704")
    void solution(int[] input, int output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input));
    }
}