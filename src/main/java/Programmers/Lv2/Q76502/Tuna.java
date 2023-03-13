package Programmers.Lv2.Q76502;

import java.util.Stack;

public class Tuna {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            // 문자열 회전
            String temp = s.substring(i) + s.substring(0, i);
            if (correctBracket(temp)) answer++;
        }

        return answer;
    }

    // 올바른 괄호 문자열인지 판별
    private boolean correctBracket(String bracket) {
        Stack<Character> stack = new Stack<>();

        for (char str : bracket.toCharArray()) {
            if (stack.isEmpty()) {
                if (str == ')' || str == '}' || str == ']')
                    return false;
                stack.push(str);
                continue;
            }

            if (stack.peek() == '(' && str == ')') {
                stack.pop();
                continue;
            }

            if (stack.peek() == '{' && str == '}') {
                stack.pop();
                continue;
            }

            if (stack.peek() == '[' && str == ']') {
                stack.pop();
                continue;
            }

            stack.push(str);
        }

        return stack.isEmpty();
    }
}
