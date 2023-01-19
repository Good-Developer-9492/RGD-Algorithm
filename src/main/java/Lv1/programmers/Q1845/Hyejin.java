package Lv1.programmers.Q1845;

import java.util.HashSet;
import java.util.Set;

public class Hyejin {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        return Math.min(set.size(),nums.length/2);
    }
}
