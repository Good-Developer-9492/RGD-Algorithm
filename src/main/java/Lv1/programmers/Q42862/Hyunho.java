package Lv1.programmers.Q42862;

import java.util.ArrayList;
import java.util.List;

public class Hyunho {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        List<Integer> queue = new ArrayList<>();

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
                if (i == lost.length -1){
                    queue.add(reserve[j]);
                }
            }
        }

        int tempIdx = 0;

        for (int l : lost) {
            if (l == -1) {
                answer++;
            }else {
                for (int i = tempIdx; i < queue.size(); i++) {
                    if (l - 1 == queue.get(i) || l + 1 == queue.get(i)) {
                        answer++;
                        tempIdx ++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
