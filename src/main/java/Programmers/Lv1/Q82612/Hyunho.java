package Programmers.Lv1.Q82612;

public class Hyunho {
    //0.21ms, 72.9MB
    public long solution(int price, int money, int count) {
        long totalMoney = 0;

        for (int i = 1; i <= count; i++) {
            totalMoney += (long) price * i;
        }

        if (money < totalMoney) {
            return totalMoney - money;
        }

        return 0;
    }
}
