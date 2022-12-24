package Lv1.programmers.Q12917;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hyunho {
    //6.74ms, 76.7MB
    public String solution(String s) {
        String[] list = s.split("");

        List<String> collect =
            Arrays.stream(list)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return String.join("", collect);
    }
}
