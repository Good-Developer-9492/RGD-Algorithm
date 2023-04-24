package Programmers.Lv2.Q154539;

import java.util.Stack;

public class Tuna {
    // (0.12ms ~ 145.84ms / 64.4MB ~ 223MB)
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        // Index값을 저장할 Stack
        Stack<Integer> stack = new Stack<>();

        // 첫 Index값 넣기
        stack.push(0);
        // 첫 Index는 넣었으니 다음값부터 배열 탐색
        for (int i = 1; i < numbers.length; i++) {
            // Stack이 비어있지 않고, 현재 배열의 값이 Stack 최상위 index 배열의 값보다 클 경우, 뒷큰수
            // 이렇게 진행하는 이유는, 현재 배열의 값에 대한 뒷큰수를 구할때 뒤에 있는 모든 배열을 살펴보지 않기 위함
            // 탐색중인 i Index만 보면서 이전 Index의 뒷큰수를 결정하기 위함
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                answer[stack.pop()] = numbers[i];
            }
            // 배열을 탐색하고 있는 현재 Index를 Stack에 추가
            stack.push(i);
        }

        // Stack에 남아있는 값들은 뒷큰수가 없는 경우
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
