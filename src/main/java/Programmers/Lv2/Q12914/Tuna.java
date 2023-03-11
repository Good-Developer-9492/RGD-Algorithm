package Programmers.Lv2.Q12914;

public class Tuna {
    // (0.1ms / 75MB)
    public long solution(int n) {
        if (n == 1) return 1;
        long[] arr = new long[n + 1];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }

        return arr[n];
    }
}
