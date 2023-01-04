package Lv1.programmers.Q12982;

import java.util.Arrays;

public class Tuna {
    // (0.35ms, 75MB)
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        for (int i : d) {
            budget -= i;
            if (budget < 0) break;
            answer++;
        }

        return answer;
    }
}
