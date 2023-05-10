package Programmers.Lv2.Q131704;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Hyunho {

    //order 순서데로 넣어야 한다.
    public int solution(int[] order) {
        int answer = 0;

        Queue<Integer> conveyorBelt = new LinkedList<>();
        Stack<Integer> subConveyorBelt = new Stack<>();

        // 123
        // 45
        // 43125


        for (int i = 0; i < order.length; i++) {
            if (order[i] == i + 1) {
                answer++;
                continue;
            }

            if (!subConveyorBelt.isEmpty() && subConveyorBelt.peek() == i + 1) {
                subConveyorBelt.pop();
                answer++;
                continue;
            }

            subConveyorBelt.push(i);
        }

        return answer;
    }
}
