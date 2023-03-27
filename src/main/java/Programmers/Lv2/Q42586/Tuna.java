package Programmers.Lv2.Q42586;

import java.util.ArrayList;
import java.util.List;

public class Tuna {
    // (2ms, 75MB)
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        for (int i = 0; i < days.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) day++;
            days[i] = day;
        }

        int deployCount = 1;
        int needDays = days[0];
        List<Integer> list = new ArrayList<>();
        int idx = 1;
        while (true) {
            if (idx >= days.length) {
                list.add(deployCount);
                break;
            }

            if (days[idx] > needDays) {
                needDays = days[idx];
                list.add(deployCount);
                deployCount = 0;
            }

            deployCount++;
            idx++;
        }

        return list.stream().mapToInt(num -> num).toArray();
    }
}
