package Programmers.Lv1.Q81301;

import static java.util.Arrays.asList;

public class Tuna {
    // (0.15ms, 75MB)
    public int solution(String s) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                answer = answer * 10 + (s.charAt(i) - '0');
                continue;
            }
            sb.append(s.charAt(i));
            if (verify(sb.toString())) {
                answer = answer * 10 + Integer.parseInt(convert(sb.toString()));
                sb = new StringBuilder();
            }
        }

        return answer;
    }

    private boolean verify(String s) {
        return asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine").contains(s);
    }

    private String convert(String s) {
        return switch (s) {
            case "one" -> "1";
            case "two" -> "2";
            case "three" -> "3";
            case "four" -> "4";
            case "five" -> "5";
            case "six" -> "6";
            case "seven" -> "7";
            case "eight" -> "8";
            case "nine" -> "9";
            default -> "0";
        };
    }
}
