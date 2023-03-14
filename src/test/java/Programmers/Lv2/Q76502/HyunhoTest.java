package Programmers.Lv2.Q76502;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyunhoTest {
    @Test
    void test1() {
        String parenthesis = "[]";
        Hyunho Hyunho = new Hyunho();
        assertTrue(Hyunho.validPair(parenthesis));
    }

    @Test
    void 첫번째_괄호가_닫힌_괄호일_경우() {
        String parenthesis = "][";
        Hyunho Hyunho = new Hyunho();
        assertFalse(Hyunho.validPair(parenthesis));
    }

    @DisplayName("false_case_}]()[{")
    @Test
    void false_case_01() {
        String parenthesis = "}]()[{";
        Hyunho Hyunho = new Hyunho();
        assertFalse(Hyunho.validPair(parenthesis));
    }

    @DisplayName("true_case_[](){}")
    @Test
    void true_case_01() {
        String parenthesis = "[](){}";
        Hyunho Hyunho = new Hyunho();
        assertTrue(Hyunho.validPair(parenthesis));
    }

    @Test
    void 문자열_왼쪽_으로_1_shift() {
        String parenthesis = "[](){}";
        Hyunho Hyunho = new Hyunho();
        assertEquals("](){}[", Hyunho.shiftRight(parenthesis));
    }

    @Test
    void solution() {
        var input = Q76502.input();
        var output = Q76502.output();

        var algorithm = new Hyunho();

        for (int i = 0; i < output.size(); i++) {
            assertEquals(output.get(i), algorithm.solution(input.get(i)));
        }
    }
}