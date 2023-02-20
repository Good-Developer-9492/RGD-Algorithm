package Programmers.Lv1.Q136798;

public class Hyejin {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int c = count(i);
            answer += c > limit ? power : c;
        }
        return answer;
    }

    private int count(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (number / i != i) {
                    count++;
                }
            }
        }
        return count;
    }

}
