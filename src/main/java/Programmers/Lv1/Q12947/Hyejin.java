package Programmers.Lv1.Q12947;

import java.util.Arrays;

public class Hyejin {
    public boolean solution(int x) {
        //(1.49ms, 76.1MB)
        String[] splitNum = String.valueOf(x).split("");
        int sum = Arrays.stream(splitNum).map(Integer::parseInt).mapToInt(a -> a).sum();
        return x % sum == 0;
    }
}
