package Programmers.Lv1.Q86051;

public class Tuna {
    // (0.02ms, 75MB)
    public int solution(int[] numbers) {
        int[] arr = new int[10];

        for (int num: numbers) {
            arr[num] = 1;
        }

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) answer += i;
        }

        return answer;
    }
}
