package Lv1.programmers.Q132267;

public class Hyejin {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int q = (n / a) * b;
            int r = n % a;
            answer += q;
            n = q + r;
        }
        return answer;
    }
}
