package Programmers.Lv2.Q70129;

public class Hyunho {
    //0.13ms, 77.1MB  - 32.34ms, 89.3MB
    public int[] solution(String s) {
        int zeroCount = 0;
        int conversionCount = 0;

        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            s = s.replaceAll("0", "");

            int length = s.length();

            s = Integer.toBinaryString(length);
            conversionCount ++;
        }

        return new int[] {conversionCount, zeroCount};
    }
}
