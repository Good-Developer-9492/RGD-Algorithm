package Programmers.Lv2.Q12973;

import java.util.Stack;

public class Tuna {
    // (0.17ms ~ 68.21ms / 58.1MB ~ 85MB) ㅎ
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (stack.peek() == c) {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        if (stack.isEmpty()) return 1;

        return 0;
    }
}
