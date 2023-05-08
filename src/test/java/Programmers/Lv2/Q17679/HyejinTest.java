package Programmers.Lv2.Q17679;

import Programmers.Lv2.Q12913.Hyunho;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @ParameterizedTest
    @MethodSource("Programmers.Lv2.ThirdWeekOfApril#Q17679")
    void solution(int input,int input2, String[] input3, int result) {
        var algorithm = new Hyejin();
        assertEquals(result, algorithm.solution(input,input2,input3));
    }
}
