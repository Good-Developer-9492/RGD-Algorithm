package Lv1.programmers.Q17681;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q17681.input1();
        var input2 = Q17681.input2();
        var input3 = Q17681.input3();
        var output = Q17681.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(
                input1.get(i),
                input2.get(i),
                input3.get(i)));
        }

    }
}