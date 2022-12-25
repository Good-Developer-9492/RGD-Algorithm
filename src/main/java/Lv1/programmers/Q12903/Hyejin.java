package Lv1.programmers.Q12903;

public class Hyejin {
    //0.02ms, 76MB
    public String solution(String s) {
        int startPoint = s.length() % 2 == 0
            ? (s.length() / 2) - 1
            : s.length() / 2;
        return s.substring(startPoint, (s.length()) / 2 + 1);
    }
}
