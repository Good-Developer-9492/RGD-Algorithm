package Programmers.Lv1.Q12921;

public class Tuna {
    // (0.5 ~ 8.8ms / 68 ~ 85MB)
    public int solution(int n) {
        int maxSize = 1000001;
        boolean[] arr = new boolean[maxSize];
        arr[0] = true;
        arr[1] = true;

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i]) continue;

            count++;

            int j = 2;
            while (i * j <= n) {
                arr[i * j] = true;
                j++;
            }
        }

        return count;
    }
}
