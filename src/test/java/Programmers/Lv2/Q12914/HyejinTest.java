package Programmers.Lv2.Q12914;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @Test
    void solution() {
        var input = Q12914.input();
        var output = Q12914.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}