package Programmers.Lv2.Q12924;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q12924.input();
        var output = Q12924.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}