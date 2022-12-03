package Lv1.programmers.Q12932;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {
    @Test
    void solution() {
        var input = Q12932Test.input();
        var output = Q12932Test.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input.size(); i++) {
            assertArrayEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }

}