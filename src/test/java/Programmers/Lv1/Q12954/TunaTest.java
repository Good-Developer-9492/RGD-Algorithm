package Programmers.Lv1.Q12954;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input_1 = Q12954.input_1();
        var input_2 = Q12954.input_2();
        var output = Q12954.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input_1.size(); i++) {
            assertArrayEquals(algorithm.solution(input_1.get(i), input_2.get(i)), output.get(i));
        }
    }
}
