package Programmers.Lv2.Q42626;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Hyunho {
    //1565.18ms, 122MB
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();

        for (int i : scoville) {
            scovilleQueue.offer(i);
        }

        while (true) {
            if (scovilleQueue.isEmpty() || scovilleQueue.peek() >= K){
                break;
            }

            if (scovilleQueue.size() < 2) {
                answer = -1;
                break;
            }

            int calcResult = mixResult(scovilleQueue.poll(), scovilleQueue.poll());
            scovilleQueue.offer(calcResult);
            answer++;
        }
        return answer;
    }

    public int mixResult(int min0, int min1) {
        return min0 + (min1 * 2);
    }
}
