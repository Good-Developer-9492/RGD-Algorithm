package Programmers.Lv1.Q86051;


public class Hyejin {
    //0.03ms, 78.1MB
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < 10; i++)
            answer += i;

        for (int number : numbers)
            answer -= number;

        return answer;
    }

}
