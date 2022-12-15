package Lv1.programmers.Q12919;


import java.util.Objects;

public class Hyejin {
    public String solution(String[] seoul) {
        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        return String.format("김서방은 %d에 있다", index);
    }

}
