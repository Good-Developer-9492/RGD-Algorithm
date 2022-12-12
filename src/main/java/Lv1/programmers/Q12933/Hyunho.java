package Lv1.programmers.Q12933;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hyunho {
    //3.55ms, 73MB
    public long solution(long n) {
        String[] numberArray = String.valueOf(n).split("");

        List<String> numbers = Arrays.stream(numberArray)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        String resultStr = String.join("",numbers);

        return Long.parseLong(resultStr);
    }
}
