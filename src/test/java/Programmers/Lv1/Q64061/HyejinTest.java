package Programmers.Lv1.Q64061;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q64061.input1();
        var input2 = Q64061.input2();
        var output = Q64061.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i),input2.get(i)));
        }
    }
}
