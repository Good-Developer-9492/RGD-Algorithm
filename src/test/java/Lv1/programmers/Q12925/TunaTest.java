package Lv1.programmers.Q12925;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input = Q12925.input();
        var output = Q12925.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
