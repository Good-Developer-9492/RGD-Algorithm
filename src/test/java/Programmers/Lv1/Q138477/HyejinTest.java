package Programmers.Lv1.Q138477;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q138477.input1();
        var input2 = Q138477.input2();
        var output = Q138477.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }

    }
}
