package Programmers.Lv2.Q42587;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.Q42587.Q42587#inputAndResult")
    void solution(int[] input1, int input2, int result) {
        var algorithm = new Hyejin();

        assertEquals(result, algorithm.solution(input1, input2));
    }
}