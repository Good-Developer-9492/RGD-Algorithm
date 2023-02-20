package Programmers.Lv1.Q140108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TunaTest {

    @Test
    void solution() {
        var input = Q140108.input();
        var output = Q140108.output();

        var algorithm = new Tuna();

        for (int i = 0; i < input.size(); i++) {
            System.out.println("================TEST CASE: " + i);
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
