package Programmers.Lv2.Q1844;

import Programmers.Lv2.Q42626.Hyunho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfApril#Q1844")
    void solution(int[][] input, int result) {
        var algorithm = new Hyejin();
        Assertions.assertEquals(result, algorithm.solution(input));
    }
}