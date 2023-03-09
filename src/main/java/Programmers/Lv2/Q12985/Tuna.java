package Programmers.Lv2.Q12985;

public class Tuna {
    // (0.02ms / 75MB)
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (n > 0) {
            // a와 b가 같은 숫자면 만나서 경기함
            if (a == b)
                break;

            // 1은 2와, 3은 4와 경기하기 때문에 홀수면 / 2 + 1을 해줘야함
            a = a % 2 == 0 ? a / 2 : a / 2 + 1;
            b = b % 2 == 0 ? b / 2 : b / 2 + 1;

            answer++;
            // 경기를 진행할수록 남은 인원은 절반
            n /= 2;
        }

        return answer;
    }
}
