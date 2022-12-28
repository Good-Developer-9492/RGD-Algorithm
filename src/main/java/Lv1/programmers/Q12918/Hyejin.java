package Lv1.programmers.Q12918;

public class Hyejin {

    public boolean solution(String s) {
//        0.03ms, 74.5MB
        if (!(s.length() == 4 || s.length() == 6)) return false;
        char[] chars = s.toCharArray();
        for (char c : chars)
            if (c > 58) return false;
        return true;
    }
}
