package Lv1.programmers.Q42748;

import java.util.Arrays;

public class Tuna {
    // (5ms, 73MB)
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = Arrays.stream(array)
                .limit(commands[i][1])
                .skip(commands[i][0] - 1)
                .sorted()
                .toArray()[commands[i][2] - 1];
        }

        return answer;
    }
}
