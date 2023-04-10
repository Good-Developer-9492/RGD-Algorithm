package Programmers.Lv2.Q42888;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfApril#Q42888")
    void solution(String[] input, String[] output) {
        var algorithm = new Tuna();
        assertArrayEquals(output, algorithm.solution(input));
    }
}
