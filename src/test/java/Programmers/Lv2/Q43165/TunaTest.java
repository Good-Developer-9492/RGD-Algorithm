package Programmers.Lv2.Q43165;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.Q43165.Q43165#inputAndResult")
    void solution(int[] input1, int input2, int output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}
