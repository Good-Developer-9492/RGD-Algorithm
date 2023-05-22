package Programmers.Lv2.Q42746;

public class Hyejin {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        //3진법만들듯이 계산 3대신 4넣기
        while (n > 0) {
            int r = n % 3;
            n /= 3;

            //나누어떨어지는 경우 3대신 4를 넣는다
            if (r == 0) {
                answer.insert(0, "4");
                n -= 1;
                continue;
            }
            //나머지는 그대로 넣는다
            answer.insert(0, r);
        }
        return answer.toString();
    }
}

