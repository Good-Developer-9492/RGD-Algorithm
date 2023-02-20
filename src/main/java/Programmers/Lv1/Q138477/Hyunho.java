package Programmers.Lv1.Q138477;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hyunho {
    //0.19ms, 75MB - 6.12ms, 86.1MB
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> ranking = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (ranking.size() >= k && score[i] > ranking.get(0)) {
                ranking.remove(0);
            }

            if (ranking.size() < k) {
                ranking.add(score[i]);
            }

            Collections.sort(ranking);

            answer[i] = ranking.get(0);
        }

        return answer;
    }
}
