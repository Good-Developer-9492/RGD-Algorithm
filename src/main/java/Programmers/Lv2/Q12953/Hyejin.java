package Programmers.Lv2.Q12953;

public class Hyejin {
    //0.01ms, 72.8MB
    //0.04ms, 83.5MB
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int gcd = getGcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }

    private int getGcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }


}
