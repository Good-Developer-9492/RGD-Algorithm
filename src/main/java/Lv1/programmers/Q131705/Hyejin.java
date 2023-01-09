package Lv1.programmers.Q131705;

public class Hyejin {
//    0.03ms, 71.7MB
    public int solution(int[] number) {
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (i == j || i == k || j == k) continue;
                    if (number[i] + number[j] + number[k] == 0) result++;
                }
            }
        }
        return result;
    }
}
