package Lv1.programmers.Q135808;

import java.util.*;
import java.util.stream.Collectors;

public class Hyejin {
    //1.80ms, 76.7MB
    //203.17ms, 166MB
    public int solution(int k, int m, int[] score) {
        int size = 0;

        List<Integer> apples = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        for (int i = 0; i < apples.size(); i += m) {
            if (i + m - 1 < apples.size()) {
                size += apples.get(i + m - 1);
            }
        }
        return size * m;
    }

}
