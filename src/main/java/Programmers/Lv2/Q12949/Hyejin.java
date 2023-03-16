package Programmers.Lv2.Q12949;

public class Hyejin {
    //0.11ms, 77.5MB
    //10.37ms, 85.4MB
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;

            }
        }
        return answer;
    }
}
