package Programmers.Lv2.Q42578;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuna {
    // (0.05ms / 75MB)
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        for (String[] arr : clothes) {
            List<String> list = map.getOrDefault(arr[1], new ArrayList<>());
            list.add(arr[0]);
            map.put(arr[1], list);
        }
        int answer = 1;

        // 해당 종류의 의상을 입지않는 경우가 존재하기 때문에 1을 더해줌
        for (String value : map.keySet()) {
            answer *= map.get(value).size() + 1;
        }

        // 모든 의상을 입지 않는 경우의 수 1을 제거
        return answer - 1;
    }
}
