package Lv1.programmers.Q42576;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q42576.input1();
        var input2 = Q42576.input2();
        var output = Q42576.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i ++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}