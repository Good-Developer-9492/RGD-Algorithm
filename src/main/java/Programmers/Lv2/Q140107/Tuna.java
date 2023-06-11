package Programmers.Lv2.Q140107;

public class Tuna {
    public long solution(int k, int d) {
        long answer = 0;

        // x의 제곱 + y의 제곱 <= d의 제곱이어야 해당 점의 위치가 d보다 작거나 같음
        for (int x = 0; x <= d; x += k) {
            // x, y중 하나만 반복해도 d가 주어져있으니 다른 하나의 최대값을 구할 수 있음
            int y = (int) Math.sqrt(Math.pow(d, 2) - Math.pow(x, 2));
            // 다른 하나를 구하면, 해당 최대값 내에 몇번이나 y가 존재할 수 있는지 체크하면 됨
            answer += y / k + 1;
        }

        return answer;
    }
}
