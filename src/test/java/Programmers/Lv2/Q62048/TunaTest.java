package Programmers.Lv2.Q62048;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.Q62048.Test#testcase")
    void solution(int input1, int input2, long output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}
