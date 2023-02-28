package Programmers.Lv2.Q12945;

import java.util.Arrays;

public class Hyejin {
    int[] arr;

    public int solution(int n) {
        arr = new int[n + 1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        fivo(n);

        return arr[n];
    }

    private int fivo(int n) {
        if (arr[n] > -1) return arr[n];
        int result = (fivo(n - 2) % 1234567 + fivo(n - 1) % 1234567) % 1234567;
        return arr[n] = result;
    }
}
