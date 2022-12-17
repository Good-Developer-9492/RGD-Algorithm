package Lv1.programmers.Q12910;

import java.util.ArrayList;
import java.util.List;
//3.18ms, 84.1MB
public class Hyejin {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) answer.add(arr[i]);
        }

        if (answer.size() == 0) {
            return new int[]{-1};
        }

        return answer.stream().mapToInt(i -> i).sorted().toArray();
    }
}
