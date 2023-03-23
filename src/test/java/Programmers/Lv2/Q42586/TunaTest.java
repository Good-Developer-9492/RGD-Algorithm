package Programmers.Lv2.Q42586;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q42586.input1();
        var input2 = Q42586.input2();
        var output = Q42586.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            System.out.println("TEST CASE: " + i);
            assertArrayEquals(algorithm.solution(input1.get(i), input2.get(i)), output.get(i));
        }
    }
}
