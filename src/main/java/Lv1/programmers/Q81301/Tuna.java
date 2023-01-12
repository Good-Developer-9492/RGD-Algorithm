package Lv1.programmers.Q81301;

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
            case "one":
                yield "1";
            case "two":
                yield "2";
            case "three":
                yield "3";
            case "four":
                yield "4";
            case "five":
                yield "5";
            case "six":
                yield "6";
            case "seven":
                yield "7";
            case "eight":
                yield "8";
            case "nine":
                yield "9";
            default:
                yield "0";
        };
    }
}
