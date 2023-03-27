package Programmers.Lv2.Q87390;

public class Hyejin {
    //0.06ms, 77MB
    //7.30ms, 117MB
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left) + 1;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
                arr[i] = Math.max((int)(left/n) +1, (int)(left%n) +1);
                left++;
            }

        return arr;
    }


}
