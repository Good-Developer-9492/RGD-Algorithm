package Programmers.Lv2.Q138476;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunaTest {

    @Test
    void solution() {
        var input1 = Q138476.input();
        var input2 = Q138476.input2();
        var output = Q138476.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input1.size(); i++) {
            assertEquals(algorithm.solution(input1.get(i), input2.get(i)), output.get(i));
        }
    }
}
