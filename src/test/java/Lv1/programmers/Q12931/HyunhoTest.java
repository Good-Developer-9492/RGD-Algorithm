package Lv1.programmers.Q12931;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {

    @Test
    void solution() {
        var input = Q12931Test.input();
        var output = Q12931Test.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }

}