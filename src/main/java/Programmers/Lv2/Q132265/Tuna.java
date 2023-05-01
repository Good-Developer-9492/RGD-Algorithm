package Programmers.Lv2.Q132265;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tuna {
    // (9.04ms ~ 217.07ms / 78.9MB ~ 189MB)
    public int solution(int[] topping) {
        // 한 사람이 가질 토핑의 종류
        Set<Integer> set = new HashSet<>();
        // <토핑의 종류, 해당 종류의 남은 개수>를 의미할 Map
        Map<Integer, Integer> map = new HashMap<>();

        int answer = 0;
        // 모든 토핑의 종류와 개수 저장
        for (int num : topping) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < topping.length - 1; i++) {
            // 한 사람이 토핑 가지기
            set.add(topping[i]);
            // 한 사람이 토핑을 가져간 만큼 전체 토핑에서 제거
            map.put(topping[i], map.get(topping[i]) - 1);
            // 저장된 해당 종류의 토핑의 개수가 0이 되면 종류 자체를 map에서 제거
            if (map.get(topping[i]) == 0) {
                map.remove(topping[i]);
            }

            // 한 사람이 가져간 토핑과 남은 토핑의 종류 비교
            if (set.size() == map.size()) {
                answer++;
            }
        }

        return answer;
    }
}
