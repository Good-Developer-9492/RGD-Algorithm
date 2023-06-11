package Programmers.Lv2.Q86971;

import java.util.*;

public class Tuna {
    public int solution(int n, int[][] wires) {
        // 최소값을 찾기위한 answer 최대로 초기화
        int answer = Integer.MAX_VALUE;

        // wires중 제외할 것 하나를 정하는 반복문
        for (int i = 0; i < wires.length; i++) {
            // 트리를 저장할 Map
            Map<Integer, Set<Integer>> map = new TreeMap<>();
            // 방문을 체크할 boolean 배열
            boolean[] checked = new boolean[n + 1];

            // 하나를 제외한 나머지 wires 들의 트리를 구성
            for (int j = 0; j < wires.length; j++) {
                if (i == j) continue;
                // 양 방향의 트리를 모두 구성
                Set<Integer> set = map.getOrDefault(wires[j][0], new HashSet<>());
                Set<Integer> set2 = map.getOrDefault(wires[j][1], new HashSet<>());
                set.add(wires[j][1]);
                set2.add(wires[j][0]);
                map.put(wires[j][0], set);
                map.put(wires[j][1], set2);
            }

            // 트리 내에서 BFS를 진행할 queue
            Queue<Integer> queue = new LinkedList<>();
            // BFS는 1에서 시작하는 것만 check하고 counting
            queue.add(1);
            checked[1] = true;

            // BFS 진행
            while (!queue.isEmpty()) {
                int num = queue.poll();
                Set<Integer> next = map.getOrDefault(num, new HashSet<>());

                for (int tmp : next) {
                    if (checked[tmp]) continue;
                    queue.add(tmp);
                    checked[tmp] = true;
                }
            }

            // 1에서 시작한 BFS로만 check한 내역을 바탕으로 true의 개수 파악
            int cnt = 0;
            for (int a = 1; a <= n; a++) {
                if (checked[a]) cnt++;
            }

            // checked의 true개수와 false개수 차이를 계산하고 기존 answer중 최소값 선택
            answer = Math.min(answer, Math.abs(n - cnt - cnt));
        }

        return answer;
    }
}
