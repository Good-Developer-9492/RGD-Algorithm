package Programmers.Lv2.Q42747;

import java.util.Arrays;

public class Tuna {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] <= answer)
                break;
            answer++;
        }

        return answer;
    }
}
