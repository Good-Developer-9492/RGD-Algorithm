package Programmers.Lv2.Q154538;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.FourthWeekOfApril#Q154538")
    void solution(int input1, int input2, int input3, int output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input1, input2, input3));
    }
}