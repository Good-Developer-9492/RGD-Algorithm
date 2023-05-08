package Programmers.Lv2.Q154539;

import java.util.Stack;

public class Hyejin {
    //0.11ms, 73.9MB
    //242.35ms, 187MB
    public int[] solution(int[] numbers) {
        //큰 값이 저장될 stack
        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[numbers.length];

        //뒷 수를 queue에 저장하기 위해 뒤에서 탑색
        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                //가까운 뒷 수 중에 큰 수가 있다면
                if (stack.peek() > numbers[i]) {
                    answer[i] = stack.peek();
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                answer[i] = -1;
            }
            stack.add(numbers[i]);

        }
        return answer;
    }
}


