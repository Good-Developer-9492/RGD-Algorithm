package Programmers.Lv2.Q12973;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution(){
        var input = Q12973.input();
        var output = Q12973.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}