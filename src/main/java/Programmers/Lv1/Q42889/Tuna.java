package Programmers.Lv1.Q42889;

import java.util.ArrayList;
import java.util.List;

public class Tuna {
    // (2ms ~ 166ms / 68MB ~ 95MB)
    public int[] solution(int N, int[] stages) {
        int[] arrival = new int[N];
        int[] clear = new int[N];

        for (int stage : stages) {
            if (stage == N + 1) {
                clear[N - 1]++;
                stage = N;
            }
            for (int i = 0; i < stage; i++) {
                arrival[i]++;
                if (i != stage - 1) clear[i]++;
            }
        }

        double[] fail = new double[N];
        for (int i = 0; i < N; i++) {
            fail[i] = (double) (arrival[i] - clear[i]) / arrival[i];
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if (fail[i] > fail[list.get(j) - 1]) {
                    list.add(j, i + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
