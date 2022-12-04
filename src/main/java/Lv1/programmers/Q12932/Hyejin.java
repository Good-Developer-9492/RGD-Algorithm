package Lv1.programmers.Q12932;


public class Hyejin {
    //0.17ms, 76.5MB
    public int[] solution(long n) {
        String word = String.valueOf(n);
        String[] num = word.split("");
        int[] result = new int[num.length];

        int j = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            result[j] = Integer.parseInt(num[i]);
            j++;
        }
        return result;
    }

}
