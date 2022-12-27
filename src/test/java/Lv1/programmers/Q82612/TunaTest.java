package Lv1.programmers.Q82612;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q82612.input1();
        var input2 = Q82612.input2();
        var input3 = Q82612.input3();
        var output = Q82612.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(algorithm.solution(input1.get(i), input2.get(i), input3.get(i)), output.get(i));
        }
    }
}
