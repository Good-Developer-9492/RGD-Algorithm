package Lv1.programmers.Q12916;

public class Hyejin {
    boolean solution(String s) {
        //(1.21ms, 74.4MB)
        String lower = s.toLowerCase();

        int countS = (int) lower.chars().filter(c->c=='p').count();
        int countY = (int) lower.chars().filter(c->c=='y').count();

        return countS == countY;
    }
}
