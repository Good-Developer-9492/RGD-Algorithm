package Programmers.Lv2.Q131701;

import java.util.HashSet;
import java.util.Set;

public class Hyunho {
    //223.71ms, 115MB
    public int solution(int[] elements) {
        Set<Integer> sumCount = new HashSet<>();

        //각 시작 자리별로 1,2,3 ... elements size까지 합을 순차적으로 구한다.
        for (int i = 0; i < elements.length; i++) {
            sumCount.add(elements[i]);
            int tempSum = elements[i];

            int idx = 0;

            for (int j = 1; j < elements.length; j++) {
                idx = i + j;

                if (idx >= elements.length) {
                    idx -= elements.length;
                }
                sumCount.add(tempSum += elements[idx]);
            }
        }

        return sumCount.size();
    }
}
