package Lv1.programmers.Q12928;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Q12928Test {

    void test(Q12928 algorithm) {
        var input = new ArrayList<Integer>();
        input.add(12);
        input.add(5);
        input.add(1);
        input.add(0);
        input.add(16);

        var output = new ArrayList<Integer>();
        output.add(28);
        output.add(6);
        output.add(1);
        output.add(0);
        output.add(31);

        for (int i = 0; i < input.size(); i++) {
            Assertions.assertEquals(output.get(i),algorithm.solution(input.get(i)));
        }

    }
}
