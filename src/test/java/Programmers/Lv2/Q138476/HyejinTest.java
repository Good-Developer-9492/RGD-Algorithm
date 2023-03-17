package Programmers.Lv2.Q138476;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @Test
    void solution() {
        var input = Q138476.input();
        var input2 = Q138476.input2();
        var output = Q138476.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i), input2.get(i)));
        }
    }
}