package Lv1.programmers.Q12922;

public class Hyejin {
    //0.47ms, 82.4MB
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) answer.append("수");
            if (i % 2 == 0) answer.append("박");
        }
        return answer.toString();
    }
}
