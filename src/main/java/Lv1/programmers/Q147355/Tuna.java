package Lv1.programmers.Q147355;

public class Tuna {
    public int solution(String t, String p) {
        int size = p.length();
        int count = 0;

        for (int i = 0; i < t.length() - size; i++) {
            if (Integer.parseInt(t.substring(i, i + size)) <= Integer.parseInt(p)) {
                count++;
            }
        }

        return count;
    }
}
