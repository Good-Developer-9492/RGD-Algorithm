package Lv1.programmers.Q12933;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q12933.input();
        var output = Q12933.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}