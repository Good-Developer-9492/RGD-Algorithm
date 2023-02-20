package Programmers.Lv1.Q12921;

public class Hyunho {
    //269.99ms, 70.3MB
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
