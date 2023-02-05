package Lv1.programmers.Q42862;

import java.util.*;

public class Hyunho {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Queue<Integer> reserveQueue = new LinkedList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int tempIdx = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = tempIdx; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    tempIdx = j;
                    break;
                }
            }
        }

        for (int r : reserve){
            if (r != -1)
                reserveQueue.add(r);
        }

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) {
                answer++;
                continue;
            }
            for (int j = 0; j < reserveQueue.size(); j++) {
                if (lost[i] -1 == reserveQueue.peek() || lost[i] +1 == reserveQueue.peek()){
                    reserveQueue.remove();
                    answer++;
                    break;
                }else if (lost[i] > reserveQueue.peek()){
                    reserveQueue.remove();
                }
            }
        }

        answer += n - lost.length;

        return answer;
    }
}
