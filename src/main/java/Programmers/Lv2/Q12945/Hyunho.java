package Programmers.Lv2.Q12945;

import java.util.ArrayList;
import java.util.List;

public class Hyunho {
    //0.01ms, 75.7MB - 2.85ms, 74.1MB
    public int solution(int n) {
        int sauceNumber = 1234567;

        int[] numbers = new int[n+1];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i <= n; i++) {
            numbers[i] = (numbers[i - 2] + numbers[i - 1]) % sauceNumber;
        }

        return numbers[n];
    }
}
