package Programmers.Lv2.Q64065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hyejin {
    //2.66ms, 69.9MB
    //97.63ms, 114MB
    public int[] solution(String s) {
        //String 전처리
        s = s.replaceAll("\\{","");
        s = s.replaceAll("}","");

        //요소 별 개수 확인
        Map<Integer, Integer> map = new HashMap<>();
        for (String v : s.split(",")) {
            map.put((Integer.valueOf(v)), map.getOrDefault(Integer.valueOf(v), 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());

        //요소가 가장 많이 나온 횟수로 정렬
        keys.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        return keys.stream().mapToInt(a -> a).toArray();
    }
}
