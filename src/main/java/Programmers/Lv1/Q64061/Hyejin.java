package Programmers.Lv1.Q64061;

import java.util.ArrayList;
import java.util.List;

public class Hyejin {
    //0.05ms, 66MB
    //2.58ms, 75.2MB
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> basket = new ArrayList<>();
        for (int n : moves) {
            for (int i = 0; i < board.length; i++) {
                //크레인 위치에 인형이 있으면 바구니에 옮겨담는다
                if (board[i][n-1] != 0) {
                    basket.add(board[i][n-1]);
                    answer+= basketCheck(basket);
                    board[i][n-1] = 0;
                    break;
                }
            }


        }
        return answer;
    }

    //바구니에 담긴 인형 두개가 같다면 pop한다
    private int basketCheck(List<Integer> basket) {
        if(basket.size()<2) return 0;
        if(basket.get(basket.size()-1).equals(basket.get(basket.size()-2))){
            basket.remove(basket.size()-1);
            basket.remove(basket.size()-1);
            return 2;
        }
        return 0;
    }
}
