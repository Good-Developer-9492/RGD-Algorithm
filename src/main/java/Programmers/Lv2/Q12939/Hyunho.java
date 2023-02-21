package Programmers.Lv2.Q12939;

public class Hyunho {
    //7.74ms, 74.7MB
    public String solution(String s) {
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (String sNum : s.split(" ")) {
            int integerNumber = Integer.parseInt(sNum);

            maxNumber = Math.max(maxNumber, integerNumber);
            minNumber = Math.min(minNumber, integerNumber);

        }
        return minNumber + " " + maxNumber;
    }
}
