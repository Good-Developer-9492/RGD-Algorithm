package Programmers.Lv1.Q12931;


public class Hyejin {
    public int solution(int n) {
        //0.14ms, 70.8MB
        int answer = 0;
        String word = String.valueOf(n);
        String[] num = word.split("");
        for (String s : num) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
