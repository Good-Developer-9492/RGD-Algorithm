package Programmers.Lv1.Q132267;

public class Hyunho {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a){
            int coke = (n / a) * b;
            int remainder = n % a;
            answer += coke;
            n = coke + remainder;
        }
        return answer;
    }
}
