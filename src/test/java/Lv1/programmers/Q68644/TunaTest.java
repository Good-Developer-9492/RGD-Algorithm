package Lv1.programmers.Q68644;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input = Q68644.input();
        var output = Q68644.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input.size(); i++) {
            assertArrayEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
