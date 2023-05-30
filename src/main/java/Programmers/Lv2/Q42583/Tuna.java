package Programmers.Lv2.Q42583;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Tuna {
    // (0.17ms ~ 195.39ms / 65.2MB ~ 160MB)
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 다리를 의미할 Queue
        Queue<Integer> queue = new LinkedList<>();
        // 각 트럭의 다리에서 위치를 의미할 Map
        Map<Integer, Integer> map = new HashMap<>();

        // 초기값 설정
        queue.add(0);
        for (int i = 0; i < truck_weights.length; i++) {
            map.put(i, 1);
        }
        // 첫 Queue를 넣어놔야되므로, 첫 트럭이 이미 올라가있는 상황을 1초로 먼저 진행
        int answer = 1;
        int lastOutIdx = -1;
        int lastInIdx = 0;

        while (!queue.isEmpty()) {
            // 시간 더하기
            answer++;

            int truck_weight = 0;
            for (int idx = lastOutIdx + 1; idx <= lastInIdx; idx++) {
                // 다리에 올라와있는 트럭들의 거리 1씩 올리기
                map.put(idx, map.get(idx) + 1);

                // 다리에 올라와있는 트럭들의 무게 합치기
                truck_weight += truck_weights[idx];
            }

            // queue에 들어있던 트럭이 다리를 다 지났는지 확인
            // 다 지났으면 pop
            if (map.get(queue.peek()) > bridge_length) {
                lastOutIdx = queue.poll();
                truck_weight -= truck_weights[lastOutIdx];
            }

            // queue에 있는 트럭들의 무게 합계가 weight를 넘는지 확인
            // 안넘으면 새로운 트럭 add
            if (lastInIdx < truck_weights.length - 1) {
                if (truck_weight + truck_weights[lastInIdx + 1] <= weight) {
                    queue.add(++lastInIdx);
                }
            }

            System.out.print(answer + " ");
            for (int i = lastOutIdx + 1; i <= lastInIdx; i++) {
                System.out.printf("(%d, %d)", truck_weights[i], map.get(i));
            }
            System.out.println();
        }

        return answer;
    }
}
