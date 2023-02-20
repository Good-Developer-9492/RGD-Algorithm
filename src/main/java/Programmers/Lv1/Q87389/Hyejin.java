package Programmers.Lv1.Q87389;

public class Hyejin {
    //(0.01ms, 74MB)
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;

    }

}
