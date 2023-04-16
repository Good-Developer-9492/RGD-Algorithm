package Programmers.Lv2.Q131127;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {


    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FirstWeekOfApril#Q131127")
    void solution(String[] input1, int[] input2, String[] input3, int output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input1, input2, input3));
    }

}