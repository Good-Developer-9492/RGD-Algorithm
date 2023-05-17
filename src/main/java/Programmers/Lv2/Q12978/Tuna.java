package Programmers.Lv2.Q12978;

import java.util.*;

public class Tuna {
    public int solution(int N, int[][] road, int K) {
        // 각 마을에서 어느 마을로 갈 수 있을지와 그 거리를 저장할 Map
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] tmp : road) {
            List<int[]> list1 = map.getOrDefault(tmp[0], new ArrayList<>());
            List<int[]> list2 = map.getOrDefault(tmp[1], new ArrayList<>());
            list1.add(new int[]{tmp[1], tmp[2]});
            list2.add(new int[]{tmp[0], tmp[2]});
            map.put(tmp[0], list1);
            map.put(tmp[1], list2);
        }
        // 각 마을까지 걸리는 최단시간을 저장할 배열
        int[] minTime = new int[N + 1];
        Arrays.fill(minTime, Integer.MAX_VALUE);

        // 각 마을까지 걸리는 최단시간을 구할 BFS에 사용할 Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        minTime[1] = 0;

        // BFS 진행
        while (!queue.isEmpty()) {
            int now = queue.poll();

            List<int[]> list = map.getOrDefault(now, Collections.emptyList());
            for (int[] tmp : list) {
                // 현재 위치까지 걸리는 거리 + 이동거리가 이동할 지점의 계산된 최단거리보다 짧을때만 추가진행
                if (minTime[now] + tmp[1] < minTime[tmp[0]]) {
                    minTime[tmp[0]] = minTime[now] + tmp[1];
                    queue.add(tmp[0]);
                }
            }
        }

        int answer = 0;
        // 최단거리가 K 이하인 위치 개수 파악
        for (int i = 1; i < N + 1; i++) {
            if (minTime[i] <= K) answer++;
        }
        return answer;
    }
}
