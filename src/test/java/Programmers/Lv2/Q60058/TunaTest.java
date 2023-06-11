package Programmers.Lv2.Q60058;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfMay#Q60058")
    void solution(String input, String output) {
        var algorithm = new Tuna();
        assertEquals(output, algorithm.solution(input));
    }
}
