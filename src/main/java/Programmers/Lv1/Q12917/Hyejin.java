package Programmers.Lv1.Q12917;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hyejin {
    //1.00ms, 72.8MB
    public String solution(String s) {

        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        list.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String v : list) sb.append(v);

        return sb.toString();
    }
}
