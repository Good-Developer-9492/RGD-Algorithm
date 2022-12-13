package Lv1.programmers.Q12943;

public class Hyunho {
    //0.04ms, 69.7MB
    public int solution(int num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1){
                num *= 3;
                num += 1;
            }
            answer++;
            if (answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
