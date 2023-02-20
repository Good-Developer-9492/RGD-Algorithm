package Programmers.Lv1.Q67256;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q67256.input1();
        var input2 = Q67256.input2();
        var output = Q67256.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input2.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}
