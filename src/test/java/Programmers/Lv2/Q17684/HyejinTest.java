package Programmers.Lv2.Q17684;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfApril#Q17684")
    void solution(String input, int[] output) {
        var algorithm = new Hyejin();
        assertArrayEquals(output, algorithm.solution(input));
    }
}