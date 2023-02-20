package Programmers.Lv1.Q136798;

import java.util.Arrays;

public class Tuna {
    // (1ms ~ 7ms / 77MB)
    public int solution(int number, int limit, int power) {
        // 에라토스테네스 체와 비슷한 방법으로 number까지의 약수를 한번에 구해두기
        int[] divisorCount = new int[number + 1];
        // 1과 자기자신을 가지기 때문에 1을 제외한 모든 숫자를 2로 초기화
        Arrays.fill(divisorCount, 2);
        divisorCount[1] = 1;
        // 2부터 number까지 본인의 배수에 모두 1씩 더하기
        for (int i = 2; i <= number; i++) {
            for (int j = 2; i * j <= number; j++) {
                divisorCount[i * j]++;
            }
        }

        // 위에서 구한 약수의 개수를 반복문을 통해 탐색하면서 제한을 넘어가는애만 골라내기
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (divisorCount[i] > limit) answer += power;
            else answer += divisorCount[i];
        }

        return answer;
    }
}
