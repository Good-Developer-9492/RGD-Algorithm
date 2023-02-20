package Programmers.Lv1.Q68935;

public class Tuna {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n >= 3) {
            sb.append(n % 3);
            n /= 3;
        }
        sb.append(n);

        int answer = sb.charAt(sb.length() - 1) - '0';
        int pow = 3;
        for (int i = sb.length() - 2; i >= 0; i--) {
            answer += (sb.charAt(i) - '0') * pow;
            pow *= 3;
        }

        return answer;
    }
}
