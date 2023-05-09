package Programmers.Lv2.Q118667;

import java.util.LinkedList;
import java.util.Queue;

public class Hyejin {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        int goal = 0;
        int q1Total = 0;
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);

            //모든 큐의 합
            goal += queue1[i];
            goal += queue2[i];

            //q1의 합
            q1Total += queue1[i];
        }

        //목표는 큐의 합의 반
        goal /= 2;
        //최대길이는 queue*3보다 작다
        int limit = q1.size() * 3;

        //q1이 절반 값이 될 때까지
        while (q1Total != goal) {
            //같은 값을 못만드는 경우
            if (limit == 0) return -1;

            //연산
            limit--;

            //q1이 더 큰 경우에는 q1의 값을 뺀다
            if (q1Total > goal) {
                int tmp = q1.poll();
                q1Total -= tmp;
                q2.add(tmp);
                continue;
            }
            //q1이 작은경우 q2의 값을 넣는다

            int tmp = q2.poll();
            q1Total += tmp;
            q1.add(tmp);

        }

        //연산횟수
        return queue1.length * 3 - limit;
    }
}
