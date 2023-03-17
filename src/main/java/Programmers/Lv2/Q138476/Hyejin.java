package Programmers.Lv2.Q138476;

import java.util.*;

public class Hyejin {
    //0.78ms, 73MB
    //95.57ms, 93.9MB
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> tangerineCount = new HashMap<>();

        //귤 종류별 개수 넣기
        for(int t : tangerine){
            tangerineCount.put(t, tangerineCount.getOrDefault(t,0)+1);
        }

        List<Integer> keySet = new ArrayList<>(tangerineCount.keySet());

        //최소한의 종류를 담기 위해 value를 기준으로 내림차순으로 정렬한다
        keySet.sort((o1, o2) -> tangerineCount.get(o2).compareTo(tangerineCount.get(o1)));

        for (int t : keySet){
            k-= tangerineCount.get(t);
            answer++;

            //귤 개수를 초과하면 더이상 카운트할 필요가 없다
            if(k<=0)break;
        }

        return answer;
    }
}
