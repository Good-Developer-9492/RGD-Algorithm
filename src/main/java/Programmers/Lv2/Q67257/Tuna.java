package Programmers.Lv2.Q67257;

import java.util.*;

public class Tuna {
    public long solution(String expression) {
        long answer = 0;
        // +, -, * 으로 나올 수 있는 모든 경우의 수
        String[] operators = new String[]{"+-*", "+*-", "-+*", "-*+", "*+-", "*-+"};

        // expression -> Queue 변환
        Queue<String> queue = new LinkedList<>();
        int num = 0;
        for (String tmp : expression.split("")) {
            // 연산자라면 현재까지의 num 추가 및 연산자 추가, num 초기화
            if (tmp.equals("+") || tmp.equals("-") || tmp.equals("*")) {
                queue.add(String.valueOf(num));
                queue.add(tmp);
                num = 0;
            } else {
                // 숫자라면 기존의 숫자 * 10 + 나온 숫자
                num = num * 10 + Integer.parseInt(tmp);
            }
        }
        // 연산자일때만 Queue에 num을 넣었으므로 마지막 num은 Queue에 안들어가있음
        queue.add(String.valueOf(num));

        // 모든 연산자 우선순위 경우의 수 순회
        for (String operator : operators) {
            // 미리 Deque를 queue로 초기화해 두는 이유는 이후 copyQueue가 deque로 값을 초기화할 것이기 때문
            Deque<String> deque = new LinkedList<>(queue);
            // 우선순위 별 연산자 순회
            String[] opers = operator.split("");
            for (String oper : opers) {
                // 기존 Expression을 의미할 copyQueue
                Queue<String> copyQueue = new LinkedList<>(deque);
                // 연산 이후의 값을 저장할 deque
                deque = new LinkedList<>();

                // copyQueue를 전부 poll할때까지 반복
                while (!copyQueue.isEmpty()) {
                    String str = copyQueue.poll();
                    // poll한 값이 현재 연산할 연산자라면 아래의 로직 수행
                    if (str.equals(oper)) {
                        // deque에 들어간 마지막값 가져오기
                        long left = Long.parseLong(deque.pollLast());
                        // copyQueue에서 다음에 꺼내올값 바로 꺼내오기
                        long right = Long.parseLong(copyQueue.poll());

                        // 연산자에 따라 연산 진행 + deque에 넣기
                        if (oper.equals("+")) {
                            deque.add(String.valueOf(left + right));
                        } else if (oper.equals("-")) {
                            deque.add(String.valueOf(left - right));
                        } else if (oper.equals("*")) {
                            deque.add(String.valueOf(left * right));
                        }
                    } else {
                        // poll한 값이 숫자거나, 지금 연산할 연산자가 아니라면 deque에 넣기
                        deque.add(str);
                    }
                }
            }
            // 최대값 찾기 (절대값 사용)
            answer = Math.max(answer, Math.abs(Long.parseLong(deque.peek())));
        }

        return answer;
    }
}
