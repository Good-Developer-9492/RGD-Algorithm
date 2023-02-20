package Programmers.Lv1.Q147355;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q147355.input1();
        var input2 = Q147355.input2();
        var output = Q147355.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}
