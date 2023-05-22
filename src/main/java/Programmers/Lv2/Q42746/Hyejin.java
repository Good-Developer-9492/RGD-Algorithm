package Programmers.Lv2.Q42746;

import java.util.Arrays;

public class Hyejin {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        //앞문자열과 뒷문자열을 합쳤을 때 기준으로 내림차순한다
        Arrays.sort(arr, (o1, o2) -> ((o2 + o1).compareTo(o1 + o2)));

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

}
