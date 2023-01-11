package Lv1.programmers.Q131705;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q131705.input();
        var output = Q131705.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}