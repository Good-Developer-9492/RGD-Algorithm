package Programmers.Lv1.Q68935;

public class Hyunho {
    //0.15ms, 74.2MB
    public int solution(int n) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            stringBuilder.append(n % 3);
            n = n / 3;
        }

        int size = stringBuilder.length() - 1;

        for (int i = 0; i < stringBuilder.length(); i++) {
            double result = Math.pow(3, size - i);
            answer += Integer.parseInt(stringBuilder.substring(i, i + 1)) * result;
        }
        return answer;
    }
}
