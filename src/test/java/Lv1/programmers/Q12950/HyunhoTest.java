package Lv1.programmers.Q12950;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q12950.input1();
        var input2 = Q12950.input2();

        var output = Q12950.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}