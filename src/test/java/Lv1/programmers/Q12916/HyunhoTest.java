package Lv1.programmers.Q12916;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HyunhoTest {

    @Test
    void solution() {
        var input = Q12916.input();
        var output = Q12916.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
