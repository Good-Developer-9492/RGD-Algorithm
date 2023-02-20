package Programmers.Lv1.Q12916;

public class Tuna {
    // (0.20ms, 75MB)
    boolean solution(String s) {
        String[] splitedInput = s.split("");

        int pCount = 0;
        int yCount = 0;
        for (String str : splitedInput) {
            if (str.equals("p") || str.equals("P"))
                pCount++;
            if (str.equals("y") || str.equals("Y"))
                yCount++;
        }

        return pCount == yCount;
    }

    // 참고용, 다른사람의 풀이
    // (1.5ms, 75MB)
//    boolean solution(String s) {
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//    }
}
