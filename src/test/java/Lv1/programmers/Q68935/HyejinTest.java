package Lv1.programmers.Q68935;

import org.junit.jupiter.api.Test;

import static Lv1.programmers.Q68935.Q68935.input;
import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input = Q68935.input();
        var output = Q68935.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}