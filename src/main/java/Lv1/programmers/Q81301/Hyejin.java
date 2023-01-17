package Lv1.programmers.Q81301;

import java.util.Arrays;
import java.util.List;

public class Hyejin {

    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String w = "";
        char[] chars = s.toCharArray();
        for (char c : chars) {

            if (Character.isDigit(c)) {
                sb.append(c);
                continue;
            }

            w+=c;

            int convertNumber = convertNumber(w);
            if(convertNumber == -1) continue;
            sb.append(convertNumber);
            w = "";
        }
        return Integer.parseInt(sb.toString());
    }

    private int convertNumber(String key) {
        List<String> words = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        return words.indexOf(key);
    }
}
