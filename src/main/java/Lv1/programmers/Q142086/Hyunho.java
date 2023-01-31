package Lv1.programmers.Q142086;

import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    //0.10ms, 73.6MB ~ 5.30ms, 91.5MB
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> alphabetStoreMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (alphabetStoreMap.get(c) == null){
                answer[i] = -1;
                alphabetStoreMap.put(c, i);
                continue;
            }

            int positionResult = i - alphabetStoreMap.get(c);
            if (positionResult != 0)
                answer[i] = positionResult;

            alphabetStoreMap.put(c, i);
        }

        return answer;
    }
}
