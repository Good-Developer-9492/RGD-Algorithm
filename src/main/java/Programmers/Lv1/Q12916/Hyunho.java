package Programmers.Lv1.Q12916;

public class Hyunho {
    //(0.06ms, 65.2MB)
    public boolean solution(String s) {
        s = s.toUpperCase();

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 80) {
                pCount ++;
            } else if (s.charAt(i) == 89) {
                yCount ++;
            }
        }

        if (pCount == yCount) {
            return true;
        }

        return false;
    }
}
