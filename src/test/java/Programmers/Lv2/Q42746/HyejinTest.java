package Programmers.Lv2.Q42746;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfMay#Q12899")
    void solution(int input, String output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input));
    }
}