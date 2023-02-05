package Lv1.programmers.Q42576;

import java.util.HashMap;
import java.util.Map;

public class Tuna {
    // (0.02ms ~ 101.34ms / 64.9 ~ 99.6MB)
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (String person : completion) {
            Integer count = map.get(person);
            map.put(person, count == null ? 1 : count + 1);
        }

        for (String person : participant) {
            Integer count = map.get(person);
            if (count == null || count == 0) {
                answer = person;
                break;
            }
            map.replace(person, count - 1);
        }

        return answer;
    }
}
