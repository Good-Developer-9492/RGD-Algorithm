package Lv1.programmers.Q118666;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q118666.input1();
        var input2 = Q118666.input2();
        var output = Q118666.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            System.out.println("================TEST CASE: " + i);
            assertEquals(algorithm.solution(input1.get(i), input2.get(i)), output.get(i));
        }
    }
}
