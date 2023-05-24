package Programmers.Lv2.Q154539;

import java.util.Stack;

public class Hyunho {
    //0.12ms, 79.5MB - 135.71ms, 199MB
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i);
                continue;
            }

            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
