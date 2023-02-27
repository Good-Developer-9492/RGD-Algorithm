package Programmers.Lv2.Q12941;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q12941.input1();
        var input2 = Q12941.input2();
        var output = Q12941.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input1.get(i),input2.get(i)));
        }
    }
}