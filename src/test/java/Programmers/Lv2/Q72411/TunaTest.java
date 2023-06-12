package Programmers.Lv2.Q72411;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfMay#Q72411")
    void solution(String[] input1, int[] input2, String[] output) {
        var algorithm = new Tuna();
        assertArrayEquals(output, algorithm.solution(input1, input2));
    }
}
