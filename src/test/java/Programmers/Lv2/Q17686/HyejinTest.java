package Programmers.Lv2.Q17686;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfApril#Q17686")
    void solution(String[] input, String[] result) {
        var algorithm = new Hyejin();
        assertArrayEquals(result, algorithm.solution(input));
    }
}