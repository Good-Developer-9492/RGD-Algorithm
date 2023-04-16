package Programmers.Lv2.Q49994;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfApril#Q49994")
    void solution(String input, int output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input));
    }
}
