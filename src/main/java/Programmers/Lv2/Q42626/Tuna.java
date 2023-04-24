package Programmers.Lv2.Q42626;

import java.util.*;
import java.util.stream.Collectors;

public class Tuna {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위큐는 알아서 우선순위가 높은 객체를 추출하고, 우선순위는 해당 객체의 compareTo로 결정된다.
        PriorityQueue<Integer> queue = Arrays.stream(scoville)
            .boxed()
            .collect(Collectors.toCollection(PriorityQueue::new));

        // 최소값이 K보다 작고, 2개이상일 경우에만 진행
        while (queue.peek() < K && queue.size() > 1) {
            int min1 = queue.poll();
            // 최소값이 K보다 크면 종료
            if (min1 >= K) return answer;
            // 최소값이 K보다 작으면 새로운 스코빌지수 만들기
            int min2 = queue.poll();
            int newScovile = min1 + (min2 * 2);
            answer++;
            // 새로운 스코빌 지수 삽입
            // 우선순위큐이기 때문에 삽입과 동시에 정렬이 이루어짐
            queue.add(newScovile);
        }

        return queue.size() == 1 && queue.peek() < K ? -1 : answer;
    }
}
