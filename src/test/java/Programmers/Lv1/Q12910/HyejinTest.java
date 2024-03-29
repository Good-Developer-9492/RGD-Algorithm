package Programmers.Lv1.Q12910;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HyejinTest {
    @Test
    void solution(){
        var input1 = Q12910.input1();
        var input2 = Q12910.input2();
        var output = Q12910.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertArrayEquals(algorithm.solution(input1.get(i), input2.get(i)), output.get(i));
        }

    }
}
