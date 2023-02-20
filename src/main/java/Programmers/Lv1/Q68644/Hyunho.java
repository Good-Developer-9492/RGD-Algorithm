package Programmers.Lv1.Q68644;

import java.util.LinkedHashSet;

public class Hyunho {
    //7.22ms, 77.3MB
    public int[] solution(int[] numbers) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                linkedHashSet.add(numbers[i] + numbers[j]);
            }
        }

        return linkedHashSet.stream()
            .sorted()
            .mapToInt(i -> i)
            .toArray();
    }
}
