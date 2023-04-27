package Programmers.Lv2.Q42746;

import java.util.Arrays;
import java.util.Comparator;

public class Hyunho {
    //2829.35ms, 414MB
    public String solution(int[] numbers) {
        String answer = "";
        String[] tempList = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tempList[i] = String.valueOf(numbers[i]);
        }

        //compareTo() - String 클래스에서 문자열 간 크기(순서)를 비교해주는 메서드
        Arrays.sort(tempList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if (tempList[0].equals("0")){
            return "0";
        }

        for (String s : tempList) {
            answer += s;
        }

        return answer;
    }
}
