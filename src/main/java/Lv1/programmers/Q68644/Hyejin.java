package Lv1.programmers.Q68644;

import java.util.Set;
import java.util.TreeSet;

public class Hyejin {
    //0.55ms, 77.7MB
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        for (int number : set) {
            answer[i] = number;
            i++;
        }
        return answer;
    }
}
