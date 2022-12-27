package Lv1.programmers.Q70128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q70128.input1();
        var input2 = Q70128.input2();
        var output = Q70128.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(algorithm.solution(input1.get(i),input2.get(i)), output.get(i));
        }

    }


}