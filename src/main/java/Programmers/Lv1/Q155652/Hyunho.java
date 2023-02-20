package Programmers.Lv1.Q155652;

public class Hyunho {
    //9.92ms, 80.1MB - 13.73ms, 74.2MB
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (char c : s.toCharArray()) {
            int count = 0;

            while (count < index) {
                c++;

                if (c > 122) {
                    c = (char) (96 + (c % 122));
                }

                if (skip.indexOf(c) <= -1) {
                    count = count + 1;
                }
            }
            answer += c;
        }
        return answer;
    }
}
