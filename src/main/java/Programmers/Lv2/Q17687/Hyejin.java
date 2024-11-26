package Programmers.Lv2.Q17687;


public class Hyejin {
    public String solution(int n, int t, int m, int p) {
        StringBuilder radix = new StringBuilder();

        //radix 값 채워넣기
        int number = 0;
        while (radix.length() < t * m) {
            radix.append(Integer.toString(number++, n).toUpperCase());
        }

        StringBuilder answer = new StringBuilder();

        //튜브탑변 채우기
        for (int i = p - 1; i < radix.length(); i += m) {
            if (answer.length() == t) break;
            answer.append(radix.charAt(i));
        }

        return answer.toString();
    }
}