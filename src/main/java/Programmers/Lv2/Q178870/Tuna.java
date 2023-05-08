package Programmers.Lv2.Q178870;

import java.util.Arrays;

public class Tuna {
    public int[] solution(int[] sequence, int k) {
        int[] lastIndex = new int[sequence.length];
        Arrays.fill(lastIndex, -1);
        int[] length = new int[sequence.length];
        Arrays.fill(length, 1000001);

        int left = 0;
        int right = 0;
        int sum = sequence[0];

        while (true) {
            if (sum == k) {
                lastIndex[left] = right;
                length[left] = right - left;
                if (right == sequence.length) {
                    lastIndex[left] -= 1;
                    length[left] -= 1;
                }
            }
            if (left == sequence.length && right == sequence.length) break;

            if (sum <= k && right < sequence.length) {
                right++;
                if (right < sequence.length) sum += sequence[right];
            } else {
                if (left < sequence.length) sum -= sequence[left];
                left++;
            }
        }

        int[] answer = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sequence.length; i++) {
            if (length[i] < min) {
                min = length[i];
                answer[0] = i;
                answer[1] = lastIndex[i];
            }
        }
        return answer;
    }
}
