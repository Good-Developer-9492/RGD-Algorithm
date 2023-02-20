package Programmers.Lv1.Q12954;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q12954.input_1();
        var input2 = Q12954.input_2();
        var output = Q12954.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(
                algorithm.solution(input1.get(i), input2.get(i)),
                output.get(i));
        }
    }
}
