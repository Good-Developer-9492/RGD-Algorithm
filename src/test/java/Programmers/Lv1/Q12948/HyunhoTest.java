package Programmers.Lv1.Q12948;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q12948.input();
        var output = Q12948.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }

}
