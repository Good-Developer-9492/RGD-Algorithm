package Programmers.Lv1.Q131128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input = Q131128.input1();
        var input2 = Q131128.input2();
        var output = Q131128.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i), input2.get(i)));
        }
    }
}
