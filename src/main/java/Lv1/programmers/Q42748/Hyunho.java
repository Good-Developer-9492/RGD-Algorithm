package Lv1.programmers.Q42748;

import java.util.Arrays;

public class Hyunho {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = calc(array, commands[i][0], commands[i][1], commands[i][2]);
        }
        return answer;
    }

    public int calc(int[] array, int start, int end, int k) {
        int size = (end - start) + 1;
        int[] results = new int[size];
        int position = 0;

        for (int i = start - 1; i < end; i++) {
            results[position] = array[i];
            position++;
        }
        Arrays.sort(results);
        return results[k-1];
    }
}
