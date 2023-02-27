package Programmers.Lv2.Q70129;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyunhoTest {
    @Test
    void solution(){
        var input = Q70129.input();
        var output = Q70129.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}