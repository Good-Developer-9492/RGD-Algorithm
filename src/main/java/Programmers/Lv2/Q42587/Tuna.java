package Programmers.Lv2.Q42587;

import java.util.LinkedList;

public class Tuna {
    // (0.5ms / 75MB)
    public int solution(int[] priorities, int location) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(i);
        }

        int idx = 1;
        A: while (!list.isEmpty()) {
            int now = list.poll();
            int priority = priorities[now];

            for (int i = 0; i < list.size(); i++) {
                if (priorities[list.get(i)] > priority) {
                    list.add(now);
                    continue A;
                }
            }

            if (now == location) break;
            idx++;
        }

        return idx;
    }
}
