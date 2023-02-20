package Programmers.Lv1.Q64061;

import java.util.Stack;

public class Tuna {
    // (0.4ms / 76MB)
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            for (int[] line : board) {
                if (line[move - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == line[move - 1]) {
                        stack.pop();
                        line[move - 1] = 0;
                        answer += 2;
                        break;
                    }
                    stack.push(line[move - 1]);
                    line[move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
