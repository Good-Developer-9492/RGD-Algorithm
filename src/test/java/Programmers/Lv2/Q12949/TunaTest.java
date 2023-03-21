package Programmers.Lv2.Q12949;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q12949.input1();
        var input2 = Q12949.input2();
        var output = Q12949.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(algorithm.solution(input1.get(i), input2.get(i)), output.get(i));
        }
    }
}
