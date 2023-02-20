package Programmers.Lv1.Q12947;

public class Tuna {
    // (0.02ms, 75MB)
    public boolean solution(int x) {
        int input = x;
        int sum = 0;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return input % sum == 0;
    }
}
