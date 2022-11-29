package Lv1.programmers.Q12937;

public class Hyunho {
    public String solution(int num) {
        return checkForOddEvenNumbers(num);
    }

    public String checkForOddEvenNumbers(int number) {
        if (number % 2 == 0)
            return "Even";

        return "Odd";
    }
}
