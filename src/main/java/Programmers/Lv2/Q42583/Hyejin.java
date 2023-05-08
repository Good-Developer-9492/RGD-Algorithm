package Programmers.Lv2.Q42583;

import java.util.LinkedList;
import java.util.Queue;

public class Hyejin {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        //전체 무게
        int totalWeight = 0;
        for (int truck : truck_weights) {
            //트럭 빠져나갈때까지
            while (true) {
                //첫번째 트럭이 빠져나갈 수 있을 때
                if (q.size() == bridge_length) {
                    totalWeight -= q.poll();
                }

                //다음 트럭이 들어올 수 없을 때
                if (totalWeight + truck > weight) {
                    q.add(0);
                    answer++;
                    continue;
                }

                //다음 트럭이 들어올 수 있을 때
                q.add(truck);
                totalWeight += truck;
                answer++;
                break;
            }

        }
        return answer + bridge_length;
    }
}
