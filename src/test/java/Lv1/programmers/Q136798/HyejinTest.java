package Lv1.programmers.Q136798;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q136798.input1();
        var input2 = Q136798.input2();
        var input3 = Q136798.input3();
        var output = Q136798.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}