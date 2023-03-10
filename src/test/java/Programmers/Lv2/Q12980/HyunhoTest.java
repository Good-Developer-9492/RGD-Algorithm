package Programmers.Lv2.Q12980;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyunhoTest {
    @Test
    void solution(){
        var input = Q12980.input();
        var output = Q12980.output();
        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            System.out.println("output = " + output.get(i));
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}