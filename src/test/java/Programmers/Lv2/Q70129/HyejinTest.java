package Programmers.Lv2.Q70129;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input = Q70129.input();
        var output = Q70129.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}