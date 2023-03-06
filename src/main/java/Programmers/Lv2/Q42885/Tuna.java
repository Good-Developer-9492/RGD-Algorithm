package Programmers.Lv2.Q42885;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Tuna {
    // (2ms / 77MB ~ 20ms / 56MB)
    public int solution(int[] people, int limit) {
        // 정렬
        Arrays.sort(people);
        // 앞뒤로 빼야되므로 Deque 사용
        Deque<Integer> deque = new ArrayDeque<>();
        for (int person : people) {
            deque.add(person);
        }

        int answer = 0;
        while (!deque.isEmpty()) {
            // 가장 작은 수의 2배가 limit를 넘으면 이제 둘이 탈 수 있는 보트는 없음
            if (deque.peekFirst() * 2 > limit) {
                break;
            }

            // 가장 큰 수와 가장 작은 수의 합이 limit 아래면 둘이 보트 탑승
            if (deque.peekFirst() + deque.peekLast() <= limit) {
                deque.pollFirst();
                deque.pollLast();
                answer++;
                continue;
            }

            // limit를 넘을 경우 가장 큰 수만 보트에 혼자 태우고 다음 탐색 진행
            deque.pollLast();
            answer++;
        }

        // 반복문이 break되어 deque에 남아있는 사람들은 모두 혼자 보트에 탑승하는 사람들
        if (!deque.isEmpty()) answer += deque.size();

        return answer;
    }
}
