package Programmers.Lv2.Q42578;

import java.util.HashMap;
import java.util.Map;

public class Hyejin {
    //0.19ms, 67.1MB
    //0.03ms, 82.7MB
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesCount = new HashMap<>();
        //종류별 개수 구하기
        for (String[] c : clothes) {
            clothesCount.put(c[1], clothesCount.getOrDefault(c[1], 0) + 1);
        }
        //종류별 조합의 수 구하기
        for (String key : clothesCount.keySet()) {

            answer *= clothesCount.get(key) + 1;
        }

        //아예 안입을 수는 없다
        return answer - 1;
    }
}
