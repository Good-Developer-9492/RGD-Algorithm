package Lv1.programmers.Q12922;

public class Hyunho {
    //1.48ms, 78MB
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                answer.append("박");
            } else {
                answer.append("수");
            }

        }
        return answer.toString();
    }
}
