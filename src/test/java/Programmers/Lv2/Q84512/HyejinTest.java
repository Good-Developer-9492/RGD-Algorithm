package Programmers.Lv2.Q84512;

import Programmers.Lv2.Q84512.Hyejin;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfApril#Q84512")
    void solution(String input, int output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input));
    }
}