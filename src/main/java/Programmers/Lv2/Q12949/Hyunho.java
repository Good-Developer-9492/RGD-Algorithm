package Programmers.Lv2.Q12949;

public class Hyunho {
    //10.48ms, 77.6MB
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i1 = 0; i1 < arr1.length; i1++) {
            for (int i2 = 0; i2 < arr2[0].length; i2++) {
                for (int i3 = 0; i3 < arr1[i1].length; i3++) {
                    answer[i1][i2] += arr1[i1][i3] * arr2[i3][i2];
                }
            }
        }

        return answer;
    }
}
