package Programmers.Lv2.Q12909;

import java.util.Stack;

public class Tuna {
    // (0.2ms ~ 20ms / 75MB ~ 53MB)
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        boolean answer = true;
        for (char str : s.toCharArray()) {
            // '('가 들어오면 stack 넣기
            if (str == '(') {
                stack.push(str);
                continue;
            }

            // ')'가 들어오는데 stack이 비어있으면 false로 종료
            if (stack.isEmpty()) {
                answer = false;
                break;
            }

            // ')'가 들어오는데 stack의 최상위가 '('면 pop
            // 완성된 괄호니까 제거해서 완성안된 괄호 찾기
            if (stack.peek() == '(') {
                stack.pop();
                continue;
            }

            stack.push(str);
        }

        // stack에 남아있는 값이 있다면 false
        if (stack.size() > 0) answer = false;

        return answer;
    }
}
