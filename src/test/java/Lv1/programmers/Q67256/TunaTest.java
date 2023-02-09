package Lv1.programmers.Q67256;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q67256.input1();
        var input2 = Q67256.input2();
        var output = Q67256.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(algorithm.solution(input1.get(i), input2.get(i)), output.get(i));
        }
    }
}
