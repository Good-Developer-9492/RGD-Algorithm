package Lv1.programmers.Q133499;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tuna {
    public int solution(String[] babbling) {
        int answer = 0;
        // "aya", "ye", "woo", "ma"
        // 발음이 완성됬을 경우 저장할 stack
        Stack<String> stack;
        // 발음을 완성시키기 위해 character를 순서대로 저장할 queue
        Queue<Character> queue;
        // 배열 탐색
        A: for (String str : babbling) {
            stack = new Stack<>();
            queue = new LinkedList<>();

            // 문자열의 모든 Character를 queue에 순서대로 저장
            for (int i = 0; i < str.length(); i++) {
                queue.add(str.charAt(i));
            }

            // Queue가 빌때까지 탐색
            while (!queue.isEmpty()) {
                // 첫 Character 가져오기 (아래 조건 분기를 위해 먼저 poll())
                char first = queue.poll();
                // 첫 Character에 따른 조건 분기
                if (first == 'a') {
                    // 옹알이에 해당하는 개수만큼 poll (비어있는지 체크하면서)
                    // 옹알이와 동일하지 않거나 비어있다면 종료
                    if (queue.isEmpty() || queue.poll() != 'y') continue A;
                    if (queue.isEmpty() || queue.poll() != 'a') continue A;

                    // 이전에 Stack에 들어간 값이 동일할 경우 조건 불일치로 종료
                    if (!stack.isEmpty() && stack.peek().equals("aya")) continue A;

                    // 조건에 모두 해당되서 종료되지 않으면 Stack 에 저장
                    stack.push("aya");
                } else if (first == 'y') { // 아래 분기들은 모두 위와 동일
                    if (queue.isEmpty() || queue.poll() != 'e') continue A;

                    if (!stack.isEmpty() && stack.peek().equals("ye")) continue A;
                    stack.push("ye");
                } else if (first == 'w') {
                    if (queue.isEmpty() || queue.poll() != 'o') continue A;
                    if (queue.isEmpty() || queue.poll() != 'o') continue A;

                    if (!stack.isEmpty() && stack.peek().equals("woo")) continue A;
                    stack.push("woo");
                } else if (first == 'm') {
                    if (queue.isEmpty() || queue.poll() != 'a') continue A;

                    if (!stack.isEmpty() && stack.peek().equals("ma")) continue A;
                    stack.push("ma");
                } else continue A;
            }

            // 종료되지 않고 해당 Line까지 도달했다면 정상적인 케이스
            answer++;
        }

        return answer;
    }
}
