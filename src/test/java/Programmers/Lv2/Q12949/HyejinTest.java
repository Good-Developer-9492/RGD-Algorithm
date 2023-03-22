package Programmers.Lv2.Q12949;

import Programmers.Lv2.Q12949.Q12949;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {
    @Test
    void solution() {
        var input1 = Q12949.input1();
        var input2 = Q12949.input2();
        var output = Q12949.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i)));
        }
    }
}