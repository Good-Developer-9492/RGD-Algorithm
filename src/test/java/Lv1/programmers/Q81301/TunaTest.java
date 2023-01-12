package Lv1.programmers.Q81301;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input = Q81301.input();
        var output = Q81301.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
