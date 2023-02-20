package Programmers.Lv1.Q12943;

public class Hyunho {
    //0.04ms, 69.7MB
    public int solution(int num) {
        int answer = 0;
        long tempNum = (long) num;

        while (tempNum != 1) {
            if (tempNum % 2 == 0) {
                tempNum = tempNum / 2;
            } else if (tempNum % 2 == 1){
                tempNum *= 3;
                tempNum += 1;
            }
            answer++;
            if (answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
