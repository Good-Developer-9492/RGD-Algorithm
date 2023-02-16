package Lv1.programmers.Q140108;

public class Hyunho {
    //0.02ms, 74.7MB - 0.86ms, 81.5MB
    public int solution(String s) {
        int answer = 0;

        char alphabet = s.charAt(0);
        int xCount = 1;
        int yCount = 0;

        for (int i = 1; i < s.length(); i++) {
            if (xCount == 0 && yCount == 0) {
                alphabet = s.charAt(i);
                xCount = 1;
                continue;
            }

            if (s.charAt(i) == alphabet) {
                xCount++;
            }else {
                yCount++;
            }

            if (xCount == yCount) {
                xCount = 0;
                yCount = 0;
                answer++;
            }
        }

        if (xCount != 0 || yCount != 0) {
            answer++;
        }

        return answer;
    }
}
