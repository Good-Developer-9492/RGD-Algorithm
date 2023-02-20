package Programmers.Lv1.Q86491;

public class Hyunho {
    //1.07ms, 105MB
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            if (width < height) {
                int temp = width;
                width = height;
                height = temp;
            }

            if (maxWidth < width) maxWidth = width;
            if (maxHeight < height) maxHeight = height;
        }

        return maxWidth * maxHeight;
    }
}
