package Lv1.programmers.Q12910;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyunhoTest {

    @Test
    void solution() {
        var input1 = Q12910.input1();
        var input2 = Q12910.input2();
        var output = Q12910.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }

}