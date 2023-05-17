package Programmers.Lv2.Q154540;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class HyejinTest {
    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfMay#Q154540")
    void solution(String[] input, int[] output) {
        var algorithm = new Hyejin();
        Assertions.assertArrayEquals(output, algorithm.solution(input));
    }

}