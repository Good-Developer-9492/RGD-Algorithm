package Programmers.Lv2.Q12985;

public class Hyejin {
    public int solution(int n, int a, int b) {
        int cnt = 0;

        while (a != b) {
            a = a == 1 ? 1 : (int) Math.ceil((double) a / 2);
            b = b == 1 ? 1 : (int) Math.ceil((double) b / 2);

            cnt++;
            if (a == b) return cnt;
        }

        return cnt;
    }
}
