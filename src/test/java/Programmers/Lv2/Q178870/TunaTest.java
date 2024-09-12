package Programmers.Lv2.Q178870;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfMay#Q178870")
    void solution(int[] input1, int input2, int[] output) {
        var algorithm = new Tuna();
        assertArrayEquals(output, algorithm.solution(input1, input2));
    }
}
