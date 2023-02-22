package Lv1.programmers.Q159994;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HyejinTest {

    @Test
    void solution() {
        var input1 = Q159994.input1();
        var input2 = Q159994.input2();
        var input3 = Q159994.input3();
        var output = Q159994.output();

        var algorithm = new Hyejin();

        for (int i = 0; i < input1.size(); i++) {
            System.out.println("input1 = " + Arrays.toString(input1.get(i)));
            System.out.println("input1 = " + Arrays.toString(input2.get(i)));
            System.out.println("input1 = " + Arrays.toString(input3.get(i)));
            assertEquals(output.get(i), algorithm.solution(input1.get(i), input2.get(i), input3.get(i)));
        }
    }
}