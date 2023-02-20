package Programmers.Lv1.Q12918;

public class Hyunho {
    //0.02ms, 70.7MB
    public boolean solution(String s) {
        if (!verifyStringLength(s.length())){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!isNumber(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean verifyStringLength(int length) {
        return length == 4 || length == 6;
    }

    private boolean isNumber(char s) {
        return s >= '0' && s <= '9';
    }
}
