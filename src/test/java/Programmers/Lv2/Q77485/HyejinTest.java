package Programmers.Lv2.Q77485;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfMay#Q77485")
    void solution(int input1, int input2, int[][] input3, int[] output) {
        var algorithm = new Hyejin();
        Assertions.assertArrayEquals(output, algorithm.solution(input1,input2,input3));
    }
}