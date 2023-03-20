package Programmers.Lv2.Q17680;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q17680.input1();
        var input2 = Q17680.input2();
        var output = Q17680.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}