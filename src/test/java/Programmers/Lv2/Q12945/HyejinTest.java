package Programmers.Lv2.Q12945;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyejinTest {

    @Test
    void solution() {
        var input = Q12945.input();
        var output = Q12945.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}