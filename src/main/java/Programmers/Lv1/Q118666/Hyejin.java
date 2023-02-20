package Programmers.Lv1.Q118666;

import java.util.HashMap;
import java.util.Map;

public class Hyejin {
    //0.12ms, 73.9MB
    //1.01ms, 78.4MB
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int point = choices[i] - 4;
            char positive = survey[i].charAt(1);
            char negative = survey[i].charAt(0);
            if (point > 0) {
                map.put(positive, map.getOrDefault(positive, 0) + point);
            }
            if (point < 0) {
                map.put(negative, map.getOrDefault(negative, 0) + (point * -1));
            }
        }

        int rtCount = 0;
        int cfCount = 0;
        int jmCount = 0;
        int anCount = 0;

        for (char type : map.keySet()) {
            int point = map.get(type);
            switch (type) {
                case 'R', 'T':
                    if (type == 'R') rtCount += point;
                    if (type == 'T') rtCount -= point;
                case 'C', 'F':

                    if (type == 'C') cfCount += point;
                    if (type == 'F') cfCount -= point;
                case 'J', 'M':

                    if (type == 'J') jmCount += point;
                    if (type == 'M') jmCount -= point;
                case 'A', 'N':
                    if (type == 'A') anCount += point;
                    if (type == 'N') anCount -= point;
            }

        }
        StringBuilder answer = new StringBuilder();
        if (rtCount >= 0) answer.append("R");
        else answer.append("T");

        if (cfCount >= 0) answer.append("C");
        else answer.append("F");

        if (jmCount >= 0) answer.append("J");
        else answer.append("M");

        if (anCount >= 0) answer.append("A");
        else answer.append("N");


        return answer.toString();

    }
}
