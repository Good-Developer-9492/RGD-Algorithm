package Programmers.Lv2.Q12900;

import Programmers.Lv2.Q131701.Hyunho;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfApril#Q12900")
    void solution(int input, int output) {
        var algorithm = new Hyejin();
        assertEquals(output, algorithm.solution(input));
    }
}