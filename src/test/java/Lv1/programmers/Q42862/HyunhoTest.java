package Lv1.programmers.Q42862;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q42862.input1();
        var input2 = Q42862.input2();
        var input3 = Q42862.input3();
        var output = Q42862.output();

        var algorithm = new Hyunho();


        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}