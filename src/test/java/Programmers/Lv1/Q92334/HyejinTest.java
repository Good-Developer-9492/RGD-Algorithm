package Programmers.Lv1.Q92334;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q92334.input1();
        var input2 = Q92334.input2();
        var input3 = Q92334.input3();
        var output = Q92334.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}
