package Programmers.Lv2.Q12900;

public class Hyunho {
    //1.05ms, 52.2MB
    public int solution(int n) {
        int answer = 1;

        int a = 1;
        int b = 1;

        for (int i = 1; i < n; i++) {
            answer = (a + b) % 1000000007;

            a = b;
            b = answer;
        }

        return answer;
    }
}
