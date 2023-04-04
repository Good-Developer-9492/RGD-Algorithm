package Programmers.Lv2.Q42587;

import java.util.Collections;
import java.util.PriorityQueue;

public class Hyunho {
    //1.44ms, 78.4MB
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> prioritiesQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int number : priorities) {
            prioritiesQueue.offer(number);
        }

        while (!prioritiesQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (!prioritiesQueue.isEmpty() && prioritiesQueue.peek() != priorities[i]) {
                    continue;
                }

                prioritiesQueue.poll();
                answer++;

                if (location == i) {
                    prioritiesQueue.clear();
                    break;
                }
            }
        }
        return answer;
    }
}

