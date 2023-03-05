package Programmers.Lv2.Q12973;

import java.util.Stack;

public class Hyejin {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (equalToPeek(stack, c)) {
                stack.pop();
                continue;
            }
            stack.add(c);
        }

        return stack.size() > 0 ? 0 : 1;
    }

    private boolean equalToPeek(Stack<Character> stack, char c) {
        return stack.size() > 0 && stack.peek() == c;
    }
}
