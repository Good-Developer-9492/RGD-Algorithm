package Lv1.programmers.Q12903;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyejinTest {

    @Test
    void solution() {
        var input = Q12903.input();
        var output = Q12903.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i),algorithm.solution(input.get(i)));
        }

    }
}