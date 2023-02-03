package Lv1.programmers.Q138477;

import java.util.ArrayList;
import java.util.List;

public class Tuna {
    // (2ms, 77MB)
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                list.add(score[i]);
                min = Math.min(min, score[i]);
            } else {
                if (min < score[i]) {
                    list.remove(min);
                    list.add(score[i]);
                    min = list.stream().min(Integer::compareTo).get();
                }
            }
            answer[i] = min;
        }

        return answer;
    }
}
