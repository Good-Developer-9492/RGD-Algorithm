package Lv1.programmers;

import Lv1.programmers.Q12937.Hyunho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Q12937Test {
    @Test
    void test() {
        var input = new ArrayList<Integer>();
        input.add(3);
        input.add(4);

        var output = new ArrayList<String>();
        output.add("Odd");
        output.add("Even");

        var algorithm = new Hyunho();

        for(int i = 0; i < input.size(); i++) {
            Assertions.assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
