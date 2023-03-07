package Programmers.Lv2.Q12985;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q12985.input1();
        var input2 = Q12985.input2();
        var input3 = Q12985.input3();
        var output = Q12985.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(algorithm.solution(input1.get(i), input2.get(i), input3.get(i)), output.get(i));
        }
    }
}
