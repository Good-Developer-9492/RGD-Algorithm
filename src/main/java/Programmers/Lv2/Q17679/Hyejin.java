package Programmers.Lv2.Q17679;

import java.util.Arrays;

public class Hyejin {
    //0.22ms, 67.9MB
    //105.87ms, 105MB
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] b = new String[m][n];

        //String 2중배열로 변경
        for (int i = 0; i < m; i++) {
            b[i] = board[i].split("");
        }

        while (true) {
            boolean[][] remove = new boolean[m][n];
            //탐색후 삭제
            boolean noMorePop = search(b, remove);
            //삭제할거 없으면 빠져나오기
            if (noMorePop) break;
            //삭제
            answer += pop(b, remove);
            //블럭떨어트리기
            move(b);
        }
        return answer;
    }

    private boolean search(String[][] board, boolean[][] remove) {
        boolean noMorePop = true;
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length - 1; j++) {
                if (canPop(board, i, j)) {
                    //네칸 true로 변경
                    noMorePop = false;
                    remove[i][j] = true;
                    remove[i][j + 1] = true;
                    remove[i + 1][j] = true;
                    remove[i + 1][j + 1] = true;
                }
            }
        }
        return noMorePop;
    }

    //기준점으로 오른쪽 & 아래 & 아래+오른쪽 같은값인지
    private boolean canPop(String[][] board, int i, int j) {
        String c = board[i][j];
        if (c == "") return false;
        return board[i][j + 1].equals(c) &&
            board[i + 1][j].equals(c) &&
            board[i + 1][j + 1].equals(c);
    }

    private int pop(String[][] board, boolean[][] remove) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (remove[i][j]) {
                    board[i][j] = "";
                    count++;
                }
            }
        }
        return count;
    }

    //열을 String으로 변환 ->
    //앞부분에 " "추가 ->
    // 배열로 변경
    private void move(String[][] board) {

        for (int i = 0; i < board[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[j][i]);
            }
            while (sb.length() < board.length) {
                sb.insert(0, " ");
            }
            String[] s = sb.toString().split("");
            for (int j = 0; j < board.length; j++) {
                board[j][i] = s[j].equals(" ") ? "" : s[j];
            }
        }
    }
}

