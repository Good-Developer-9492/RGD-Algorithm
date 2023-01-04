package Lv1.programmers.Q12982;

import java.util.Arrays;

public class Hyejin {
    //0.35ms, 73.3MB
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        int sum = 0;
        for (int j : d) {
            sum += j;
            answer++;
            if (sum == budget) {
                break;
            }
            if (sum > budget) {
                answer--;
                break;
            }
        }
        return answer;
    }
}
