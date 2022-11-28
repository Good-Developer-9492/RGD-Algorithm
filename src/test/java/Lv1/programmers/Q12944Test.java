package Lv1.programmers;

import Lv1.programmers.Q12944.Hyejin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Q12944Test {
    @Test
    void test() {
        var input = new ArrayList<int[]>();
        input.add(new int[]{1, 2, 3, 4});
        input.add(new int[]{5, 5});

        var output = new ArrayList<Double>();
        output.add(2.5);
        output.add(5.0);

        var algorithm = new Hyejin();

        for(int i = 0; i < input.size(); i++) {
            Assertions.assertEquals(algorithm.solution(input.get(i)), output.get(i));
        }
    }
}
