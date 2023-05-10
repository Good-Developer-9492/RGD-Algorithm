package Programmers.Lv2.Q131704;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Hyejin {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> subContainerBelt = new Stack<>();

        //
        int orderIdx = 0;

        //컨테이너벨트
        for (int i = 1; i <= order.length; i++) {
            //컨테이너벨트 값과 기사가 원하는 상자가 다른경우 보조 컨테이너에 넣는다
            if (i != order[orderIdx]) {
                subContainerBelt.add(i);
                continue;
            }

            // 컨베이어 벨트 값 == 기사 원하는 값
            orderIdx++;
            answer++;

            // 보조 컨베이어벨트 탐색
            while (subContainerBelt.size() > 0 && subContainerBelt.peek() == order[orderIdx]) {
                subContainerBelt.pop();
                orderIdx++;
                answer++;
            }
        }

        return answer;
    }
}
