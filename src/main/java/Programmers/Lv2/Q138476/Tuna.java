package Programmers.Lv2.Q138476;

import java.util.*;

public class Tuna {
    // (30ms / 90MB)
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        // 각 num에 대한 귤의 개수 파악
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 귤의 개수 내림차순으로 정렬
        List<Integer> sortedList = new ArrayList<>(map.values());
        sortedList.sort(Collections.reverseOrder());

        int answer = 0;
        for (int num : sortedList) {
            if (k <= 0) break;
            k -= num;
            answer++;
        }

        return answer;
    }
}
