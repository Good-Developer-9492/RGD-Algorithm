package Lv1.programmers.Q77884;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q77884.input1();
        var input2 = Q77884.input2();
        var output = Q77884.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(output.get(i),algorithm.solution(input1.get(i),input2.get(i)));
        }
    }
}