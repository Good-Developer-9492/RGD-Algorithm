package Programmers.Lv2.Q132265;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hyejin {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> cake1 = new HashMap<>();

        //map에 케이크 넣기
        for (int t : topping) {
            cake1.put(t, cake1.getOrDefault(t, 0) + 1);
        }

        Set<Integer> cake2 = new HashSet<>();

        for (int t : topping) {
            //map에 있는 값을 하나씩 뺀다
            cake1.get(t);
            cake1.put(t, cake1.get(t) - 1);

            //map에 key가 0이면 삭제
            if (cake1.get(t) == 0) {
                cake1.remove(t);
            }

            //뺀 값 set에 저장
            cake2.add(t);

            //map과 set의 사이즈가 같다면
            //(동일하게 케이크가 쪼개졌다면)
            //answer++;
            if (cake1.size() == cake2.size()) {
                answer++;
            }
        }

        return answer;
    }
}
