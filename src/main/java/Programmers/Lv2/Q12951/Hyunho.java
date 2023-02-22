package Programmers.Lv2.Q12951;

public class Hyunho {
    //14.93ms, 75.8MB
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        boolean blankState = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isBlank(c)) {
                blankState = true;
            } else if (blankState) {
                if (isMinuscule(c)) {
                    c = (char) (c - 32);
                }
                blankState = false;
            }
            answer += c;
        }

        return answer;
    }

    private boolean isBlank(char c) {
        return c == ' ';
    }

    private boolean isMinuscule(char c) {
        return (c >= 'a' && c <= 'z');
    }
}
