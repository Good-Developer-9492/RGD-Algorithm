package Programmers.Lv1.Q77884;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q77884.input1();
        var input2 = Q77884.input2();
        var output = Q77884.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }

}
