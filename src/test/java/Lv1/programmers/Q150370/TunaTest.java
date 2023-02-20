package Lv1.programmers.Q150370;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q150370.input1();
        var input2 = Q150370.input2();
        var input3 = Q150370.input3();
        var output = Q150370.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            System.out.println("=================TEST CASE: " + i);
            assertArrayEquals(algorithm.solution(input1.get(i), input2.get(i), input3.get(i)), output.get(i));
        }
    }
}
