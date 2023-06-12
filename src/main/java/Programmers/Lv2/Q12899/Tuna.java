package Programmers.Lv2.Q12899;

public class Tuna {
    // (0.2ms / 73MB)
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            // 1, 2, 4가 반복되므로 3으로 나눈 나머지 값 활용
            int num = n % 3;
            // 3으로 나눈 값을 활용하므로 n을 3으로 계속 나누기
            n /= 3;

            // 나머지값에 따른 String 추가
            if (num == 0) {
                sb.append("4");
                // 3으로 나누어 떨어지는 값을 3으로 나눌 경우, 1이 남기 때문에 이 경우에만 -1
                n -= 1;
            } else if (num == 1) {
                sb.append("1");
            } else {
                sb.append("2");
            }
        }

        // sb.append()를 사용했으므로 결과는 뒤집어줘야함.
        return sb.reverse().toString();
    }
}
