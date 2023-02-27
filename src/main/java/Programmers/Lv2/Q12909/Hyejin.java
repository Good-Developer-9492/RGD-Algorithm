package Programmers.Lv2.Q12909;

import java.util.Stack;

public class Hyejin {
    //0.02ms, 67.5MB
    //20.93ms, 68.3MB
    boolean solution(String s) {
        //시작이 ) 이거나 끝이 ( 면 false
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                //) 앞에는 무조건 (가 있어야 한다.
                if (stack.size() == 0) return false;
                if (stack.peek() == ')') return false;

                stack.pop();
                continue;
            }
            stack.add(c);
        }

        return stack.size() == 0;
    }
}
