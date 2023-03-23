package Programmers.Lv2.Q87390;

public class Hyunho {
    //5.50ms, 93.5MB
    public int[] solution(int n, long left, long right) {
        int answerSize = (int) (right - left + 1);
        int[] answer = new int[answerSize];
        int idx = 0;
        for (long i = left; i < right + 1; i++) {
            answer[idx] = (int) Math.max(i / n, i % n) + 1;
            idx++;
        }
        return answer;
    }
}
