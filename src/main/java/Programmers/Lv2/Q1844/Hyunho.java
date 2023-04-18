package Programmers.Lv2.Q1844;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Hyunho {
    //7.40ms, 53.1MB
    public int solution(int[][] maps) {

        int rowLength = maps.length;
        int colLength = maps[0].length;
        boolean[][] visited = new boolean[rowLength][colLength];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (maps[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }


        Queue<Node> nodeQueue = new LinkedList<>();
        visited[0][0] = true;
        nodeQueue.add(new Node(0, 0, 1));
        int min = Integer.MAX_VALUE;

        int[] rowArray = new int[]{1, -1, 0, 0};
        int[] colArray = new int[]{0, 0, 1, -1};

        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.poll();

            for (int i = 0; i < 4; i++) {
                int row = node.row + rowArray[i];
                int col = node.col + colArray[i];

                if (rowLength <= row
                    || row < 0
                    || colLength <= col
                    || col < 0
                ) {
                    continue;
                }

                if (visited[row][col]) {
                    continue;
                }

                visited[row][col] = true;
                nodeQueue.add(new Node(row, col, node.move + 1));
                if (row == rowLength - 1 && col == colLength - 1) {
                    min = Math.min(min, node.move + 1);
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }

//    record Node(int row, int col, int move) {}

    public static class Node{
        private final int row;
        private final int col;
        private final int move;

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int getMove() {
            return move;
        }

        public Node(int row, int col, int move) {
            this.row = row;
            this.col = col;
            this.move = move;
        }
    }
}
