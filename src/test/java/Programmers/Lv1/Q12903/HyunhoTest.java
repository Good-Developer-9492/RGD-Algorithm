package Programmers.Lv1.Q12903;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {

    @Test
    void solution() {
        var input = Q12903.input();
        var output = Q12903.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }

    }
}
