package Lv1.programmers.Q147355;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q147355.input1();
        var input2 = Q147355.input2();
        var output = Q147355.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}