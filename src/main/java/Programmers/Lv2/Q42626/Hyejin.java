package Programmers.Lv2.Q42626;

import java.util.*;

//0.31ms, 77.1MB
//1479.51ms, 121MB
public class Hyejin {
    public int solution(int[] scoville, int k) {
        //정렬한다
        Queue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }
        int answer = 0;
        while (queue.size() > 1) {
            if (queue.peek() >= k) break;
            int newScoville = queue.poll() + (queue.poll() * 2);
            queue.add(newScoville);
            answer++;
        }

        if (queue.size() > 0 && queue.peek() < k) return -1;
        return answer;
    }
}
