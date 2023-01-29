package Lv1.programmers.Q142086;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input = Q142086.input();
        var output = Q142086.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}