package Programmers.Lv2.Q42583;

import java.util.LinkedList;
import java.util.Queue;

public class Hyunho {
    //46.94ms, 84.6MB
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sumWeight = 0;

        Queue<Integer> truckQueue = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            while (true) {
                if (truckQueue.isEmpty()) {
                    //다리가 비어 있을때
                    truckQueue.offer(truck_weight);
                    sumWeight += truck_weight;
                    answer++;
                    break;
                } else if (truckQueue.size() == bridge_length) {
                    //다리가 차있을때
                    sumWeight -= truckQueue.poll();
                }

                //다리에 공간이 있을때
                if (truck_weight + sumWeight > weight) {
                    //합이 다리 최대 하중을 넘으면
                    truckQueue.offer(0);
                    answer++;
                } else {
                    truckQueue.offer(truck_weight);
                    sumWeight += truck_weight;
                    answer++;
                    break;
                }
            }
        }
        return answer + bridge_length;
    }
}
