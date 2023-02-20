package Programmers.Lv1.Q12954;

public class Hyunho {
    public long[] solution(int x, int n) {
        //0.04ms, 79MB
        long[] answer = new long[n];
        long temp = x;

        answer[0] = temp;
        for (int i = 1; i < n; i++) {
            temp += x;
            answer[i] = temp;
        }

        return answer;
    }
}
