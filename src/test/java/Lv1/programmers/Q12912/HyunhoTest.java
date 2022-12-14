package Lv1.programmers.Q12912;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {

    @Test
    void solution() {
        var input1 = Q12912.input1();
        var input2 = Q12912.input2();
        var output = Q12912.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(
                output.get(i),
                algorithm.solution(input1.get(i), input2.get(i))
            );
        }
    }

}