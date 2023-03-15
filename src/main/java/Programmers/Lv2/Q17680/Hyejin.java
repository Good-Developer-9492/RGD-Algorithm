package Programmers.Lv2.Q17680;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

public class Hyejin {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();
        int answer = 0;

        for (String city : cities) {
            city = city.toLowerCase(Locale.ROOT);
            if (isHit(queue, city)) {
                answer += 1;
            } else {
                //오래된 애 빼기
                if (queue.size() >= cacheSize) queue.poll();
                answer += 5;
            }
            //새로운 값 갱긴
            if (queue.size() < cacheSize) queue.add(city);
        }
        return answer;
    }

    private boolean isHit(Queue<String> queue, String city) {
        for (String q : queue) {
            if (q.equals(city)) {
                queue.remove(q);
                return true;
            }
        }
        return false;
    }
}
