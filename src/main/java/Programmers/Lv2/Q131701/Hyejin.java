package Programmers.Lv2.Q131701;

import java.util.HashSet;
import java.util.Set;

public class Hyejin {
    //0.09ms, 76.3MB
    //884.67ms, 120MB
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j <= elements.length - 1; j++) {
                int sum = 0, count = 0, idx = j;
                while (count < i) {
                    sum += elements[idx++];
                    count++;
                    idx = idx > elements.length - 1 ? 0 : idx;
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
