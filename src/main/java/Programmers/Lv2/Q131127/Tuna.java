package Programmers.Lv2.Q131127;

import java.util.HashMap;
import java.util.Map;

public class Tuna {
    // (20ms / 110MB)
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // discount 순회 (10개 탐색의 시작위치 정하기)
        A: for (int i = 0; i <= discount.length - 10; i++) {
            // 원하는 장바구니 품목과 개수를 map으로 저장
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            }

            // discount 시작위치부터 10개 탐색
            for (int j = 0; j < 10; j++) {
                // map에 저장되어 있는 값을 가져오기, 없다면 0
                int count = map.getOrDefault(discount[i + j], 0);
                // 0이라면 장바구니에 없거나, 원하는 품목의 개수를 전부 가져왔음
                // 그런데도 for문이 진행중이라면 조건에 해당하지 않으니 다음 시작위치 탐색
                if (count == 0) continue A;
                // 원하는 품목 하나 가져오면 장바구니 해당 개수 하나 줄이기
                map.replace(discount[i + j], count - 1);
            }
            // 다음 시작위치를 탐색하러 가지 않고 for문이 종료되면 성공을 의미
            answer++;
        }

        return answer;
    }
}
