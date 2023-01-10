package Lv1.programmers.Q131705;

public class Tuna {
    // (0.02ms, 75MB)
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }

        return answer;
    }
}
