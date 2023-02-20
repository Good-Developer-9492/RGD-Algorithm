package Programmers.Lv1.Q42576;

import java.util.*;

public class Hyejin {
    //0.04ms, 71MB
    //90.73ms, 97.1MB
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        String answer = "";
        for (String m : map.keySet()) {
            if (map.get(m) == 1) {
                answer = m;
                break;
            }

        }


        return answer;
    }
}
