package Programmers.Lv2.Q12941;

import java.util.Arrays;

public class Hyejin {
    //0.33ms, 73.7MB
    //2.79ms, 52.2MB
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i< A.length; i++){
            answer += A[i] * B[B.length-1-i];
        }

        return answer;
    }
}
