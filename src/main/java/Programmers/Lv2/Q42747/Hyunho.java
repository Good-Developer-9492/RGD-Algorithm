package Programmers.Lv2.Q42747;

import java.util.Arrays;

public class Hyunho {
    //0.90ms, 72.4MB
    public int solution(int[] citations) {
        int answer = 0;
        int papersCount = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < papersCount; i++) {
            int hIndex = papersCount - i;
            if (citations[i] >= hIndex) {
                answer = hIndex;
                break;
            }
        }

        return answer;
    }
}
