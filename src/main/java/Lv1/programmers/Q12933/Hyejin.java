package Lv1.programmers.Q12933;

import java.util.*;

import java.util.stream.Collectors;

public class Hyejin {
    public long solution(long n) {
        //(1.54ms, 76.3MB)
        List<String> collect = Arrays.stream(String.valueOf(n).split(""))
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());

        String s = String.join("", collect);

        return Long.parseLong(s);
    }
}
