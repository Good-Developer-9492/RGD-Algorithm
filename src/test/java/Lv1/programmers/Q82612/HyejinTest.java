package Lv1.programmers.Q82612;

import Lv1.programmers.Q12918.Q12918;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q82612.input1();
        var input2 = Q82612.input2();
        var input3 = Q82612.input3();
        var output = Q82612.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i),algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}