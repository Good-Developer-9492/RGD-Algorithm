package Programmers.Lv2.Q87390;

public class Tuna {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            answer[idx] = (int) (Math.max(i / n, i % n) + 1);
            idx++;
        }

        return answer;
    }
}
