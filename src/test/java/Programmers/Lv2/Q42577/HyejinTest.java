package Programmers.Lv2.Q42577;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.Q42577.Q42577#inputAndResult")
    void solution(String[] input, boolean output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input));
    }

}