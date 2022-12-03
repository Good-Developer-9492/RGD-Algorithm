package Lv1.programmers.Q12932;

public class Hyunho {

    public int[] solution(long n) {
        //0.18ms, 78.8MB
        String[] numbers = String.valueOf(n).split("");
        int[] answer = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            answer[(numbers.length - 1) - i] = Integer.parseInt(numbers[i]);
        }

        return answer;
    }
}
