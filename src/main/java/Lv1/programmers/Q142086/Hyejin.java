package Lv1.programmers.Q142086;

public class Hyejin {
    //0.01ms, 75MB
    //9.53ms, 85.7MB
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int dis = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    dis = i - j;
                    break;
                }
            }
            answer[i] = dis;
        }

        return answer;
    }
}