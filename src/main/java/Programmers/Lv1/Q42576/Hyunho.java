package Programmers.Lv1.Q42576;

import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> participantMap = new HashMap<>();
        for (String s : participant) {
            participantMap.put(s, participantMap.getOrDefault(s, 0)+1);
        }

        for (String s : completion) {
            participantMap.put(s, participantMap.getOrDefault(s, 0)-1);
        }

        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) != 0){
                answer = s;
            }
        }

        return answer;
    }
}
