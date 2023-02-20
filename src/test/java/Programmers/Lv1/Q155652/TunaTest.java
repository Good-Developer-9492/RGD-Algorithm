package Programmers.Lv1.Q155652;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q155652.input1();
        var input2 = Q155652.input2();
        var input3 = Q155652.input3();
        var output = Q155652.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            System.out.println("================TEST CASE: " + i);
            assertEquals(algorithm.solution(input1.get(i), input2.get(i), input3.get(i)), output.get(i));
        }
    }
}
