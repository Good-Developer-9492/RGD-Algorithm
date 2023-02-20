package Programmers.Lv1.Q68644;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q68644.input();
        var output = Q68644.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertArrayEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}
