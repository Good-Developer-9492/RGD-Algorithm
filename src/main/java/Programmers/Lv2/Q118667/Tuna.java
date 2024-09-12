package Programmers.Lv2.Q118667;

import java.util.LinkedList;
import java.util.Queue;

public class Tuna {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        long q1Sum = 0;
        for (int num : queue1) {
            q1.add(num);
            q1Sum += num;
        }
        Queue<Integer> q2 = new LinkedList<>();
        long q2Sum = 0;
        for (int num : queue2) {
            q2.add(num);
            q2Sum += num;
        }

        int answer = 0;
        while (q1Sum != q2Sum) {
            if (q1Sum > q2Sum) {
                int num = q1.poll();
                q1Sum -= num;
                q2.add(num);
                q2Sum += num;
            } else if (q2Sum > q1Sum) {
                int num = q2.poll();
                q2Sum -= num;
                q1.add(num);
                q1Sum += num;
            }

            answer++;

            if (answer > queue1.length * 3) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
