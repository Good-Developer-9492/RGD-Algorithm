package Programmers.Lv1.Q12903;

public class Tuna {
    // (0.02ms, 75MB)
    public String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1) : s.substring(s.length() / 2, s.length() / 2 + 1);
    }
}
