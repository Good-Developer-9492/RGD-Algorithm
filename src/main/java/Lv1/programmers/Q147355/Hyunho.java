package Lv1.programmers.Q147355;

public class Hyunho {
    //8.26ms, 76.3MB
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {

            if (Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
