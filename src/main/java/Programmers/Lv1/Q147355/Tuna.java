package Programmers.Lv1.Q147355;

public class Tuna {
    // (5ms, 75MB)
    public int solution(String t, String p) {
        int size = p.length();
        int count = 0;

        for (int i = 0; i < t.length() - size + 1; i++) {
            long num = Long.parseLong(t.substring(i, i + size));
            if (num <= Long.parseLong(p)) {
                count++;
            }
        }

        return count;
    }
}
