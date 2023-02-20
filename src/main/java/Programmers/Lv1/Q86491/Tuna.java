package Programmers.Lv1.Q86491;

public class Tuna {
    // (0.3ms, 80MB)
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxLength = 0;

        for (int[] size : sizes) {
            if (size[0] >= size[1]) {
                maxWidth = Math.max(maxWidth, size[0]);
                maxLength = Math.max(maxLength, size[1]);
            } else {
                maxWidth = Math.max(maxWidth, size[1]);
                maxLength = Math.max(maxLength, size[0]);
            }
        }

        return maxWidth * maxLength;
    }
}
