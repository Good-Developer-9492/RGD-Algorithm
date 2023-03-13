package Programmers.Lv2.Q42747;

import java.util.Arrays;

public class Hyejin {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h = 0;

        for (int i = citations.length - 1; i >= 0; i--) {
            if (h >= citations[i]) break;
            h++;
        }
        return h;
    }
}
