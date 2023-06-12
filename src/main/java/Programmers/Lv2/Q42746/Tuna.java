package Programmers.Lv2.Q42746;

import java.util.Arrays;

public class Tuna {
    public String solution(int[] numbers) {
        // sort에 활용할 Integer 배열로 변환
        Integer[] temp = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        // sort
        Arrays.sort(temp, (n1, n2) -> {
            String s1 = String.valueOf(n1);
            String s2 = String.valueOf(n2);

            // 문자열 두개 합친 후 더 큰 문자열 사용
            return (s2 + s1).compareTo(s1 + s2);
        });

        // 첫 값이 0이면 나머지 전부 0
        if (temp[0] == 0) return "0";

        StringBuilder sb = new StringBuilder();
        for (int number : temp) {
            sb.append(number);
        }

        return sb.toString();
    }
}
