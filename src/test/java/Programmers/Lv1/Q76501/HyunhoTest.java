package Programmers.Lv1.Q76501;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q76501.input1();
        var input2 = Q76501.input2();
        var output = Q76501.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }

}
