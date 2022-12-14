package Lv1.programmers.Q12943;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HyejinTest {
    @Test
    void solution() {
        var input = Q12943.input();
        var output = Q12943.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}
