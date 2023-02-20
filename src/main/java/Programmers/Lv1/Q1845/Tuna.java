package Programmers.Lv1.Q1845;

import java.util.HashSet;
import java.util.Set;

public class Tuna {
    // (0.2ms, 75MB)
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), nums.length / 2);
    }
}
