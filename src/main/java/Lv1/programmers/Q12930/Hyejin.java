package Lv1.programmers.Q12930;

import java.util.Locale;

public class Hyejin {
//    0.04ms, 74.3MB
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (char c : s.toCharArray()) {
            if (index %2== 0) sb.append(String.valueOf(c).toUpperCase(Locale.ROOT));
            else sb.append(String.valueOf(c).toLowerCase(Locale.ROOT));

            if (c == ' ') index = 0;
            else index++;
        }

        return sb.toString();
    }
}
