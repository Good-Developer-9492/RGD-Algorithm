package Programmers.Lv2.Q12951;

public class Hyejin {
    //0.04ms, 72.4MB
    //0.09ms, 77.1MB
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean firstWord = true;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                firstWord = true;
            } else if (firstWord) {
                c = Character.toUpperCase(c);
                firstWord = false;
            }
            answer.append(c);
        }
        return answer.toString();
    }

}
