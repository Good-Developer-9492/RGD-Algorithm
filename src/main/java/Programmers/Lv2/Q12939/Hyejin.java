package Programmers.Lv2.Q12939;

public class Hyejin {
    //8.15ms, 80MB
    //15.88ms, 77MB
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String sNum : s.split(" ")) {
            int n = Integer.parseInt(sNum);

            max = Math.max(max, n);
            min = Math.min(min, n);

        }
        return min + " " + max;
    }
}
