package Lv1.programmers.Q42840;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input = Q42840.input();
        var output = Q42840.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input.size(); i++) {
            assertArrayEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
