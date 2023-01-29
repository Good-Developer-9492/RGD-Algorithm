package Lv1.programmers.Q147355;

public class Hyejin {
    //4.66ms, 79.4MB
    public int solution(String t, String p) {
        int answer = 0;
        long np = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long n1 = Long.parseLong(t.substring(i, i + p.length()));
            if (n1 <=np) {
                answer++;
            }
        }
        return answer;
    }
}
