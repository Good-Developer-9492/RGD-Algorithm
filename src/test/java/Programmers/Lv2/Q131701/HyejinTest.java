package Programmers.Lv2.Q131701;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.Q131701.Q131701#inputAndResult")
    void solution(int[] input, int output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input));
    }
}