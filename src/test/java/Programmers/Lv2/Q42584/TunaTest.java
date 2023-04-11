package Programmers.Lv2.Q42584;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfApril#Q42584")
    void solution(int[] input, int[] output) {
        var algorithm = new Tuna();
        assertArrayEquals(output, algorithm.solution(input));
    }
}
