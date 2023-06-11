package Programmers.Lv2.Q17683;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfMay#Q17683")
    void solution(String input1, String[] input2, String output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}
