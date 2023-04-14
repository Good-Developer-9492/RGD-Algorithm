package Programmers.Lv2.Q49993;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.SecondWeekOfApril#Q49993")
    void solution(String input1, String[] input2, int output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input1, input2));
    }
}