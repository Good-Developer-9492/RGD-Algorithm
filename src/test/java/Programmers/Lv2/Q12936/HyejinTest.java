package Programmers.Lv2.Q12936;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfMay#Q12936")
    void solution(int input1, long input2, int[] output) {
        var algorithm = new Hyejin();
        assertArrayEquals(output, algorithm.solution(input1, input2));
    }

}