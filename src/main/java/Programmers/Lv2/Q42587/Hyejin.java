package Programmers.Lv2.Q42587;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hyejin {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        //우선순위별 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                //정렬된 값과 배열의 값 비교
                if (!queue.isEmpty() && queue.peek() != priorities[i]) continue;

                queue.poll();
                answer++;

                if (location == i) return answer;
            }
        }

        return answer;
    }


}
