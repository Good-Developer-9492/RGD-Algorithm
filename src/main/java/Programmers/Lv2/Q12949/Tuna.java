package Programmers.Lv2.Q12949;

public class Tuna {
    // (5ms, 80MB)
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        // arr1의 row만큼 반복
        for (int i = 0; i < arr1.length; i++) {
            // arr2의 col만큼 반복
            for (int j = 0; j < arr2[0].length; j++) {
                // arr1의 col(arr2의 row와 동일)만큼 반복
                for (int k = 0; k < arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
