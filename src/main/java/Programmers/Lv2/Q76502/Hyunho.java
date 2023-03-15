package Programmers.Lv2.Q76502;

import java.util.Stack;

public class Hyunho {
    //67.09ms, 87.4MB
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (validPair(s)) {
                answer++;
            }
            s = shiftRight(s);
        }
        return answer;
    }

    public String shiftRight(String s) {
        return s.substring(1) + s.charAt(0);
    }

    public boolean validPair(String parenthesis) {
        if (parenthesis.charAt(0) == ')' || parenthesis.charAt(0) == '}' || parenthesis.charAt(0) == ']') {
            return false;
        }
        if (parenthesis.length() % 2 != 0) {
            return false;
        }

        Stack<Character> parenthesisStack = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            char p = parenthesis.charAt(i);

            if (!parenthesisStack.isEmpty() &&
                ((parenthesisStack.peek() == '(' && p == ')')
                    || (parenthesisStack.peek() == '{' && p == '}')
                    || (parenthesisStack.peek() == '[' && p == ']'))
            ) {
                parenthesisStack.pop();
                continue;
            }

            parenthesisStack.push(p);
        }
        return parenthesisStack.isEmpty();
    }
}
