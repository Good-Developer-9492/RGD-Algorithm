package Lv1.programmers.Q132267;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q132267.input1();
        var input2 = Q132267.input2();
        var input3 = Q132267.input3();
        var output = Q132267.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(
                output.get(i),
                algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}