package Programmers.Lv1.Q17681;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q17681.input1();
        var input2 = Q17681.input2();
        var input3 = Q17681.input3();
        var output = Q17681.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertArrayEquals(
                output.get(i),
                algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}
