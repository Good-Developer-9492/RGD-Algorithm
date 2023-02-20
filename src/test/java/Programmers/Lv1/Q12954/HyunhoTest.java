package Programmers.Lv1.Q12954;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class HyunhoTest {
    @Test
    void solution() {
        var input1 = Q12954.input_1();
        var input2 = Q12954.input_2();
        var output = Q12954.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(
                algorithm.solution(input1.get(i), input2.get(i)),
                output.get(i));
        }
    }
}
