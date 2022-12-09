package Lv1.programmers.Q12933;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HyejinTest {

    @Test
    void solution() {
        var input = Q12933.input();
        var output = Q12933.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
