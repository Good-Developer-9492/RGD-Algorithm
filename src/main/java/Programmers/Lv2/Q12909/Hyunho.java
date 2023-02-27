package Programmers.Lv2.Q12909;

import java.util.Stack;

public class Hyunho {
    //0.11ms, 63.2MB
    public boolean solution(String s) {
        Stack<Character> parenthesisStack = new Stack<>();

        ///s가 짝수이거나, 첫번째 문자가 ")" 이면 false
//        if (verifyFalseCondition(s)){
//            return false;
//        }
        if (s.charAt(0) == ')' || (s.length() % 2 != 0)) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char parenthesis = s.charAt(i);
            if (!parenthesisStack.isEmpty() && (parenthesisStack.peek() == '(' && parenthesis == ')')) {
                parenthesisStack.pop();
                continue;
            }
            parenthesisStack.push(parenthesis);
        }

        return parenthesisStack.isEmpty();
    }

    private boolean verifyFalseCondition(String s) {
        return s.charAt(0) == ')' || (s.length() % 2 != 0);
    }
}
