package Lv1.programmers.Q12928;

import java.util.*;

public class Hyejin implements Q12928 {
    public int solution(int n) {
        Set<Integer> set = new HashSet<>();
        int goal = n;
        int i = 1;
        if(goal==1) set.add(1);
        while (goal > i) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
                goal = n / i;
            }
            i++;
        }


        return set.stream().mapToInt(s -> s).sum();
    }
}
