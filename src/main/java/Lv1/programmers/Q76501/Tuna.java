package Lv1.programmers.Q76501;

public class Tuna {
    // (0.05ms, 74MB)
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return sum;
    }
}
