package Programmers.Lv2.Q12941;

import java.util.Arrays;

public class Hyunho {
    //0.36ms, 83MB - 2.88ms, 52.8MB
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[(A.length - 1) - i];
        }

        return answer;
    }
}
