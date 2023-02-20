package Programmers.Lv1.Q12931;

public class Hyunho {
    //0.17ms, 71.5MB
    public int solution(int n) {
        int answer = 0;

        String[] numArray = String.valueOf(n).split("");
        for (String number : numArray) {
            answer += Integer.parseInt(number);
        }

        return answer;
    }
}
