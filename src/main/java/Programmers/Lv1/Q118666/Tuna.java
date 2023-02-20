package Programmers.Lv1.Q118666;

import java.util.HashMap;
import java.util.Map;

public class Tuna {
    // (0.4ms / 75MB)
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            // 4를 기준으로 3210123으로 점수를 매기는 방식
            int number = choices[i] - 4;
            // choices가 5, 6, 7인 경우 survey의 2번째값에 추가
            if (number > 0) {
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + Math.abs(number));
            }
            // choices가 1, 2, 3인 경우 survey의 1번째값에 추가
            else if (number < 0) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + Math.abs(number));
            }
            // choices가 4인 경우는 어차피 0으로 어디에도 추가하지 않기때문에 진행하지 않아도 괜찮
        }

        StringBuilder sb = new StringBuilder();
        // 1, 2, 3, 4번째 지표를 순서대로 담은 배열 생성 (loop 목적)
        char[][] arr = new char[][]{{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        for (char[] temp : arr) {
            // 두 지표의 값 비교, 큰 값의 지표를 추가
            if (map.getOrDefault(temp[0], 0) > map.getOrDefault(temp[1], 0)) {
                sb.append(temp[0]);
            } else if (map.getOrDefault(temp[0], 0) < map.getOrDefault(temp[1], 0)) {
                sb.append(temp[1]);
            } else { // 두 지표의 값이 동일하다면 사전순으로 지표가 우선적인 것 추가
                if (temp[0] > temp[1]) {
                    sb.append(temp[1]);
                } else {
                    sb.append(temp[0]);
                }
            }
        }

        return sb.toString();
    }
}
