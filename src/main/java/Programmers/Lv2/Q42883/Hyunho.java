package Programmers.Lv2.Q42883;

public class Hyunho {
    //0.04ms, 73.3MB - 7743.98ms, 77.6MB
    public String solution(String number, int k) {
        String answer;
        StringBuilder stringBuilder = new StringBuilder();

        if (number.charAt(0) == '0') {
            return "0";
        }

        int position = 0;
        char maxNumber;

        for (int i = 0; i < number.length() - k; i++) {
            maxNumber = '0';

            for (int j = position; j <= k + i; j++) {
                if (number.charAt(j) > maxNumber) {
                    maxNumber = number.charAt(j);
                    position = j + 1;
                }
            }

            stringBuilder.append(maxNumber);
        }

        answer = stringBuilder.toString();
        return answer;
    }
}
