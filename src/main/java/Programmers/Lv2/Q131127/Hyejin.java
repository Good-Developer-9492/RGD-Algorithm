package Programmers.Lv2.Q131127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hyejin {
    //0.08ms, 75.4MB
    //82.60ms, 115MB
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        //과일을 개수별로 리스트에 담는다
        List<String> wants = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                wants.add(want[i]);
            }
        }

        //첫날부터 마지막날 -10일까지 반복한다
        for (int i = 0; i <= discount.length - 10; i++) {
            List<String> discountsByMembership = new ArrayList<>(List.of(Arrays.copyOfRange(discount, i, i + 10)));
            int purchaseCount = 0;
            for (String s : wants) {
                int idx = discountsByMembership.indexOf(s);
                //해당 기간에는 내가 원하는 물건을 살 수 없다
                if (idx == -1) break;
                //구매
                purchaseCount++;
                discountsByMembership.remove(idx);
            }
            //다 구매한 경우
            if (purchaseCount == wants.size()) answer++;
        }
        return answer;
    }
}
