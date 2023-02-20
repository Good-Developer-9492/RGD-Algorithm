package Programmers.Lv1.Q12903;

public class Hyunho {
    public String solution(String s) {
        int wordLength = s.length();

        if (isEven(s)) {
            return String.valueOf(s.charAt((wordLength / 2) - 1)) + s.charAt((wordLength / 2));
        }
        return String.valueOf(s.charAt((wordLength / 2)));
    }

    private boolean isEven(String s) {
        if (s.length() % 2 == 0) {
            return true;
        }
        return false;
    }
}
