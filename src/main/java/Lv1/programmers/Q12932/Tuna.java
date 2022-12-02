package Lv1.programmers.Q12932;

public class Tuna {
    // (0.15ms, 75MB)
    public int[] solution(long n) {
        String[] input = String.valueOf(n).split("");

        int[] answer = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            answer[input.length - (i + 1)] = Integer.parseInt(input[i]);
        }

        return answer;
    }
}
