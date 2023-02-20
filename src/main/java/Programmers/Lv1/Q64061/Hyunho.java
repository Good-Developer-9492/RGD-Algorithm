package Programmers.Lv1.Q64061;

import java.util.Stack;

public class Hyunho {
    //0.13ms, 75.7MB - 1.37ms, 76.3MB
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //인형을 담는 바구니
        Stack<Integer> numberStack = new Stack<>();

        for (int move : moves) {
            int xAxis = move - 1;

            for (int i = 0; i < board.length; i++) {
                int value = board[i][xAxis];

                //0인지 아닌지 확인
                if (!isZero(value)) {
                    board[i][xAxis] = 0;
                    //바구니에 가장 위에있는 숫자 비교하여 삭제하거나 숫자를 넣는다.
                    if (numberStack.size() != 0 && value == numberStack.peek()) {
                        numberStack.pop();
                        answer += 2;
                    } else {
                        numberStack.push(value);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    private boolean isZero(int i) {
        return i == 0;
    }
}
