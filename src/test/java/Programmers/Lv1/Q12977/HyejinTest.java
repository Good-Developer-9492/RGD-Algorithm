package Programmers.Lv1.Q12977;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input = Q12977.input();
        var output = Q12977.output();

        var algorithm = new Hyejin();

        for (
            int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}
