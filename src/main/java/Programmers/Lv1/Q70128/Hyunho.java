package Programmers.Lv1.Q70128;

import java.util.stream.IntStream;

public class Hyunho {
    //3.17ms, 79.6MB
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
            .map(index -> a[index] * b[index])
            .sum();
    }
}
