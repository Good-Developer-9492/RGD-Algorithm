package Programmers.Lv1.Q12947;

public class Hyunho {
    //0.04ms, 82.8MB
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return x % sum == 0;
    }
}
