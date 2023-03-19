package Programmers.Lv2.Q17680;

import java.util.LinkedList;
import java.util.Queue;

public class Tuna {
    // (1ms, 80MB)
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();
        int answer = 0;
        if (cacheSize == 0) return cities.length * 5;

        for (String city : cities) {
            // 대소문자 구분 없음
            city = city.toLowerCase();
            // 캐싱되있다면 +1
            if (queue.contains(city)) {
                answer += 1;
                // 기존 캐싱된 데이터 지우고 새로넣기
                queue.remove(city);
            } else answer += 5;

            // 캐싱 데이터 관리
            if (queue.size() < cacheSize) queue.add(city);
            else {
                queue.poll();
                queue.add(city);
            }
        }

        return answer;
    }
}
