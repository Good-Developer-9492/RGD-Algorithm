package Programmers.Lv2.Q17687;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfApril#Q17687")
    void solution(int input1, int input2, int input3, int input4, String result) {
        var algorithm = new Hyejin();
        Assertions.assertEquals(result, algorithm.solution(input1, input2, input3, input4));
    }
}