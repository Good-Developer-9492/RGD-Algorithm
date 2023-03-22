package Programmers.Lv2.Q42578;

import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothMap = new HashMap<String, Integer>();
        for (String[] clothe : clothes) {
            String key = clothe[1];
            clothMap.put(key, clothMap.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : clothMap.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        return answer - 1;
    }
}
