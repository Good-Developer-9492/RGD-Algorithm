package Lv1.programmers.Q68935;

public class Hyejin {
    //0.06ms, 77.3MB
    public int solution(int n) {
        String reverseTriad = getReverseTriad(n);
        return getDecimal(reverseTriad);
    }

    private int getDecimal(String s) {
        int size = s.length() - 1;
        double decimal = 0;
        for (int i = 0; i < s.length(); i++) {
            double result = Math.pow(3, size - i);
            decimal += Integer.parseInt(s.substring(i, i + 1)) * result;
        }
        return (int)decimal;
    }

    private String getReverseTriad(int n){
        StringBuilder s = new StringBuilder();
        while (!(n == 0)) {
            s.append(n % 3);
            n = n / 3;
        }
        return s.toString();
    }
}
