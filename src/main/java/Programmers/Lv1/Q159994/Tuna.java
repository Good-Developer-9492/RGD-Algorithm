package Programmers.Lv1.Q159994;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Tuna {
    // (0.15ms / 73MB)
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1 순서대로 저장
        Queue<String> card1Queue = new LinkedList<>();
        Collections.addAll(card1Queue, cards1);

        // cards2 순서대로 저장
        Queue<String> card2Queue = new LinkedList<>();
        Collections.addAll(card2Queue, cards2);

        // goal 탐색
        for (String str : goal) {
            // card1의 가장 앞 문자열이 동일한지 확인
            if (!card1Queue.isEmpty() && card1Queue.peek().equals(str)) {
                card1Queue.poll();
                continue;
            }

            // card2의 가장 앞 문자열이 동일한지 확인
            if (!card2Queue.isEmpty() && card2Queue.peek().equals(str)) {
                card2Queue.poll();
                continue;
            }

            // 두 카드뭉치의 가장 앞 문자열과 동일하지 않다면 goal이 달성될 수 없음
            return "No";
        }

        return "Yes";
    }
}
