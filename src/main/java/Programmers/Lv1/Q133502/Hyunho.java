package Programmers.Lv1.Q133502;

import java.util.Stack;

public class Hyunho {
    //0.10ms, 73.4MB - 81.33ms, 121MB
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingredientStack = new Stack<>();
        for (int i : ingredient) {
            if (ingredientStack.isEmpty()) {
                ingredientStack.push(i);
                continue;
            }
            if (ingredientStack.peek() == 1 && i == 2) {
                ingredientStack.pop();
                ingredientStack.push(12);
                continue;
            }
            if (ingredientStack.peek() == 12 && i == 3) {
                ingredientStack.pop();
                ingredientStack.push(123);
                continue;
            }
            if (ingredientStack.peek() == 123 && i == 1) {
                ingredientStack.pop();
                answer++;
                continue;
            }
            ingredientStack.push(i);
        }
        return answer;
    }
}
