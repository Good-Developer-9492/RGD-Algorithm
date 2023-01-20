package Lv1.programmers.Q132267;

public class Tuna {
    // (0.03ms, 77MB)
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int cokeFromMart = n / a * b;
            int remainAfterReturn = n % a;

            answer += cokeFromMart;
            n = cokeFromMart + remainAfterReturn;
        }

        return answer;
    }
}
