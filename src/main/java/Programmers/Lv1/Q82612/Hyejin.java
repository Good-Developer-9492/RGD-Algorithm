package Programmers.Lv1.Q82612;

public class Hyejin {
    public long solution(int price, int money, int count) {
        //0.17ms, 71.2MB
        long amount = 0;

        while (!(count < 0))
            amount += price * count--;

        return Math.max(amount - money, 0);
    }
}
