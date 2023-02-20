package Programmers.Lv1.Q12930;

public class Hyunho {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (isEven(idx)){
                answer.append(String.valueOf(c).toUpperCase());
            } else {
                answer.append(String.valueOf(c).toLowerCase());
            }

            idx ++;
            if (c == ' '){
                idx = 0;
            }
        }
        return answer.toString();
    }

    private boolean isEven(int idx) {
        return idx % 2 == 0;
    }
}
