package Programmers.Lv2.Q12924;

public class Hyejin {
    //0.02ms, 75.2MB
    //1.78ms, 52.2MB
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum > n) break;
                if (sum == n) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
