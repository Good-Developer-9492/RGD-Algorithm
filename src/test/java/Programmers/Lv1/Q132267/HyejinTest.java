package Programmers.Lv1.Q132267;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q132267.input1();
        var input2 = Q132267.input2();
        var input3 = Q132267.input3();
        var output = Q132267.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}
