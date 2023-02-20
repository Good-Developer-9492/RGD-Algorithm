package Programmers.Lv1.Q12935;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input = Q12935.input1();
        var output = Q12935.output();

        var algorithm = new Tuna();

        for (int i = 0; i <input.size(); i++) {
            assertArrayEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
