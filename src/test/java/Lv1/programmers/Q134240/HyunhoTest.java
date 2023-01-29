package Lv1.programmers.Q134240;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q134240.input();
        var output = Q134240.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++){
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}