package Lv1.programmers.Q12843;

import Lv1.programmers.Q12943.Q12943;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {

    @Test
    void solution() {
        var input = Q12943.input();
        var output = Q12943.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }

}