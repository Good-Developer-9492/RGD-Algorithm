package Lv1.programmers.Q12915;

import java.util.Arrays;

public class Tuna {
    // (3ms, 75MB)
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted((o1, o2) -> {
            if(o1.charAt(n) < o2.charAt(n)) return -1;
            else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
            else return 1;
        }).toArray(String[]::new);
    }
}
