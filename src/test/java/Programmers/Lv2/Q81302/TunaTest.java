package Programmers.Lv2.Q81302;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.Q81302.Test#testcase")
    void solution(String[][] input, int[] output) {
        var algorithm = new Tuna();
        assertArrayEquals(output, algorithm.solution(input));
    }
}
