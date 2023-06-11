package Programmers.Lv2.Q132265;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hyunho {
    //201.39ms, 169MB
    public int solution(int[] topping) {
        //map에 토핑 별로 가지수 저장
        //자료구조 set에 담는다.
        //set에 크기를 비교하여 공평한지 비교
        int answer = 0;
        Map<Integer, Integer> cakeMap = new HashMap<>();
        for (int t : topping) {
            cakeMap.put(t, cakeMap.getOrDefault(t, 0) + 1);
        }

        Topping toppingStatus = new Topping(cakeMap);
        Set<Integer> cakeSet = new HashSet<>();

        for (int t : topping) {
            //map에 있는 값을 제거
            //뺀 값 set에 저장
            cakeSet.add(t);
            toppingStatus.reducedToppings(t);

            //map에 토핑이 0개 이면 삭제
            toppingStatus.checkZeroToppingAndRemove(t);

            //map과 set의 사이즈가 같다면
            if (toppingStatus.sameToppingSize(cakeSet.size())) {
                answer++;
            }
        }

        return answer;
    }

    static class Topping {
        private final Map<Integer, Integer> map;

        public Topping(Map<Integer, Integer> map) {
            this.map = map;
        }

        public void reducedToppings(int topping) {
            this.map.put(topping, map.get(topping) - 1);
        }

        public void checkZeroToppingAndRemove(int topping) {
            if (this.map.get(topping) == 0) {
                this.map.remove(topping);
            }
        }

        public boolean sameToppingSize(int size) {
            return this.map.size() == size;
        }
    }
}
