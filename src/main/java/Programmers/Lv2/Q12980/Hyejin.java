package Programmers.Lv2.Q12980;

public class Hyejin {

    public int solution(int n) {
        int battery = 0;
        while (n != 0) {
            //홀수
            if (n % 2 == 1) {
                battery++;
                n--;
                continue;
            }
            //짝수
            n /= 2;
        }
        return battery;
    }

}
