package Lv1.programmers.Q86491;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q86491.input();
        var output = Q86491.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}