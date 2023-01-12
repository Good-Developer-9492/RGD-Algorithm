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
        String converted = "0";
        switch (s) {
            case "one":
                converted = "1";
                break;
            case "two":
                converted = "2";
                break;
            case "three":
                converted = "3";
                break;
            case "four":
                converted = "4";
                break;
            case "five":
                converted = "5";
                break;
            case "six":
                converted = "6";
                break;
            case "seven":
                converted = "7";
                break;
            case "eight":
                converted = "8";
                break;
            case "nine":
                converted = "9";
                break;
            default:
                converted = "0";
        };

        return converted;
    }
}
