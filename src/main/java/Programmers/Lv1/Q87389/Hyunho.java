package Programmers.Lv1.Q87389;

public class Hyunho {
    //0.03ms, 76.2MB
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
