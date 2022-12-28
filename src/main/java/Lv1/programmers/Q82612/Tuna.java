package Lv1.programmers.Q82612;

public class Tuna {
    // (0.05ms, 75MB)
    public long solution(int price, int money, int count) {
        long answer = (long) count * (count + 1) / 2 * price - money;

        if (answer < 0) return 0;

        return answer;
    }
}
