package Programmers.Lv1.Q12937;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyejinTest {

    @Test
    void test() {
        var input = new ArrayList<Integer>();
        input.add(3);
        input.add(4);

        var output = new ArrayList<String>();
        output.add("Odd");
        output.add("Even");

        var algorithm = new Hyejin();

        for (int i = 0; i < input.size(); i++) {
            assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
