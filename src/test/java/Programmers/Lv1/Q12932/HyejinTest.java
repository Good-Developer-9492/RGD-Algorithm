package Programmers.Lv1.Q12932;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HyejinTest {
    @Test
    void solution(){
        var input = Q12932Test.input();
        var output = Q12932Test.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertArrayEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
