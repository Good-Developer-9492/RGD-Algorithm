package Programmers.Lv2.Q118667;

import java.util.LinkedList;
import java.util.Queue;

public class Hyejin {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long q1Sum = 0;
        for (int q : queue1) {
            q1.add(q);
            q1Sum += q;
        }

        long q2Sum = 0;
        for (int q : queue2) {
            q2.add(q);
            q2Sum += q;
        }

        int answer = 0;
        while (q1Sum != q2Sum) {

            if (q1Sum > q2Sum) {
                int q = q1.poll();
                q1Sum -= q;
                q2Sum += q;
                q2.add(q);
            } else {
                int q = q2.poll();
                q2Sum -= q;
                q1Sum += q;
                q1.add(q);
            }

            answer++;

            if (answer > queue1.length * 3) return -1;

        }
        return answer;

    }
}
