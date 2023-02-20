package Programmers.Lv1.Q133502;

import java.util.Stack;

public class Hyejin {
    //0.10ms, 73MB
    //56.38ms, 138MB
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >= 4) {
                //패턴 확인하기
                if (stack.get(stack.size() - 1) == 1
                    && stack.get(stack.size() - 2) == 3
                    && stack.get(stack.size() - 3) == 2
                    && stack.get(stack.size() - 4) == 1
                ) {
                    //맞으면 stack에서 빼기
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
