package Programmers.Lv1.Q77484;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q77484.input1();
        var input2 = Q77484.input2();
        var output = Q77484.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i),input2.get(i)));
        }
    }
}
