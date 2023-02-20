package Programmers.Lv1.Q12912;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HyejinTest {
    @Test
    void solution() {
        var input1 = Q12912.input1();
        var input2 = Q12912.input2();
        var output = Q12912.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(
                output.get(i),
                algorithm.solution(input1.get(i), input2.get(i))
            );
        }
    }

}
