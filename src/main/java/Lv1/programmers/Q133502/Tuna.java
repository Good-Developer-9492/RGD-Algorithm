package Lv1.programmers.Q133502;

import java.util.Stack;

public class Tuna {
    // (0.13ms ~ 68.88ms / 69.4MB ~ 147MB)
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int igd : ingredient) {
            System.out.println("PEEK: " + (stack.isEmpty() ? "EMPTY" : stack.peek()) + ", IGD: " + igd);
            if (stack.isEmpty()) {
                stack.push(igd);
                continue;
            }

            if (stack.peek() == 1 && igd == 2) {
                stack.pop();
                stack.push(12);
                continue;
            }

            if (stack.peek() == 12 && igd == 3) {
                stack.pop();
                stack.push(123);
                continue;
            }

            if (stack.peek() == 123 && igd == 1) {
                stack.pop();
                answer++;
                continue;
            }

            stack.push(igd);
        }

        return answer;
    }
}
