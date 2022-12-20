package Lv1.programmers.Q86051;

public class Hyunho {
    //0.03ms, 76.8MB
    public int solution(int[] numbers) {
        int answer = -1;
        int maxSum = 45;
        int tempSum = 0;

        for (int number : numbers){
            tempSum += number;
        }
        if (tempSum != 0){
            answer = maxSum - tempSum;
        }
        return answer;
    }
}
