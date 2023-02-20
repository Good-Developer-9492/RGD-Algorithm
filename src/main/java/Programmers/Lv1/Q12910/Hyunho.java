package Programmers.Lv1.Q12910;

import java.util.ArrayList;
import java.util.List;

public class Hyunho {
    //11.47ms, 92MB
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int number : arr) {
            if (number % divisor == 0) {
                answer.add(number);
            }
        }

        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream()
            .mapToInt(i -> i)
            .sorted()
            .toArray();
    }
}
