package Lv1.programmers.Q12915;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q12915.input1();
        var input2 = Q12915.input2();
        var output = Q12915.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }

    }
}