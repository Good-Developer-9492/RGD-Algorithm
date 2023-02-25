package Programmers.Lv2.Q12941;

import java.util.Arrays;

public class Tuna {
    // (0.4ms ~ 2.5ms / 75MB ~ 52MB)
    public int solution(int[] A, int[] B) {
        // 정렬 stream sorted 사용하면 효율성 탈락
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            // A의 최소값과 B의 최대값을 서로 곱하면 전체의 최소값
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}
