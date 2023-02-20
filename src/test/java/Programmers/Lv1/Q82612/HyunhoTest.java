package Programmers.Lv1.Q82612;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q82612.input1();
        var input2 = Q82612.input2();
        var input3 = Q82612.input3();

        var output = Q82612.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            Assertions.assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }

}
