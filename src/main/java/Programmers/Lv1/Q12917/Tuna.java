package Programmers.Lv1.Q12917;

import java.util.Arrays;

public class Tuna {
    // (2.7ms, 75MB)
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split("")).mapToInt(value -> value.charAt(0)).sorted().toArray();

        StringBuilder sb = new StringBuilder();

        for(int i : arr) {
            sb.insert(0, (char) i);
        }

        return sb.toString();
    }
}
