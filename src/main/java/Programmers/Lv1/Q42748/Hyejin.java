package Programmers.Lv1.Q42748;

import java.util.Arrays;

public class Hyejin {
    //0.37ms, 73.6MB
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] newArray = Arrays.copyOfRange(array, (commands[i][0] - 1), (commands[i][1]));
            Arrays.sort(newArray);

            result[i] = newArray[commands[i][2] - 1];
        }
        return result;
    }
}
