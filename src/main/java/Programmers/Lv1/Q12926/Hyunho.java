package Programmers.Lv1.Q12926;

public class Hyunho {
    //1.33ms, 75.2MB
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int dec = s.charAt(i);
            if (isUpperCase(dec)) {
                dec += n;
                if (90 < dec) {
                    dec -= 26;
                }

            }
            if (isLowerCase(dec)) {
                dec += n;
                if (122 < dec) {
                    dec -= 26;
                }
            }
            answer.append((char) dec);
        }
        return answer.toString();
    }

    private boolean isLowerCase(int c) {
        return 97 <= c && 122 >= c;
    }

    private boolean isUpperCase(int c) {
        return 65 <= c && 90 >= c;
    }
}
