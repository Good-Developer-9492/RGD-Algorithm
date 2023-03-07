package Programmers.Lv2.Q12973;

import java.util.Stack;

public class Hyunho {
    //0.10ms, 73.6MB - 64.27ms, 61.9MB)
    public int solution(String s) {
        Stack<Character> alphabetStack = new Stack<>();

        if (s.length() % 2 != 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alphabetStack.isEmpty()) {
                alphabetStack.push(c);
                continue;
            }

            if (isSameAlphabet(alphabetStack.peek(), c)) {
                alphabetStack.pop();
                continue;
            }

            alphabetStack.push(c);
        }

        if (alphabetStack.isEmpty()) {
            return 1;
        }

        return 0;
    }

    private boolean isSameAlphabet(char c1, char c2) {
        return c1 == c2;
    }
}
