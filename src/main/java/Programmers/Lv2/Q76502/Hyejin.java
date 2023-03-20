package Programmers.Lv2.Q76502;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Hyejin {
    public int solution(String s) {
        //홀수면 올바른 괄호가 아니다
        if (s.length() % 2 == 1) return 0;

        //안움직였을 때 괄호 체크
        int answer = isBracket(s) ? 1 : 0;

        for (int i = 1; i < s.length(); i++) {
            s = move(s);
            if (isBracket(s)) answer++;
        }
        return answer;
    }

    //괄호 체크
    private boolean isBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.add(c);
                continue;
            }
            if (stack.size() > 0 && isSet(c, stack.peek())) {
                stack.pop();
            }
        }
        return stack.size() == 0;
    }

    private boolean isSet(char c, Character peek) {
        if(c == '}') return peek == '{';
        if(c == ')') return peek == '(';
        if(c == ']') return peek == '[';
        return false;
    }


    //괄호 옮기기
    private String move(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);
        return sb.toString();
    }
}
