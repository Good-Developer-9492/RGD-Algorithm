package Programmers.Lv2.Q42586;

import java.util.ArrayList;
import java.util.List;

public class Hyejin {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int num = 1;
            int term = calTerm(progresses[i], speeds[i]);

            while (i < progresses.length - 1) {
                if (calTerm(progresses[i + 1], speeds[i + 1]) > term) break;
                i++;
                num++;
            }

            list.add(num);
        }
        return list.stream().mapToInt(v -> v).toArray();
    }

    private int calTerm(int progress, int speed) {
        return (int) Math.ceil((100 - progress) / (double) speed);
    }
}
