package Lv1.programmers.Q12935;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {

    @Test
    void solution() {
        var input = Q12935.input1();
        var output = Q12935.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertArrayEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }

}