package Programmers.Lv1.Q70128;

public class Hyejin {
    //0.03ms, 75.1MB
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
