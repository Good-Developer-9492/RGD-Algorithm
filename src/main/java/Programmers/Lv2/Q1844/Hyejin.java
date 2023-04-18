package Programmers.Lv2.Q1844;


import java.util.LinkedList;
import java.util.Queue;

public class Hyejin {
    public int solution(int[][] maps) {
        int count = -1;

        //동서남북 (y,x)
        int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        //시작부분 넣기
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1));
        //맨 첫번째 방문처리
        maps[0][0] = 0;

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            int x = now.getX();
            int y = now.getY();
            int d = now.getDepth();

            //맨 끝에 도달한경우
            if (maps.length - 1 == y && maps[0].length - 1 == x) {
                count = d;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + move[i][0];
                int nx = x + move[i][1];

                if (!canVisit(maps, nx, ny)) continue;

                //다음에 갈 곳 방문처리
                maps[ny][nx] = 0;
                queue.add(new Node(ny, nx, d + 1));
            }
        }

        return count;
    }

    private boolean canVisit(int[][] maps, int x, int y) {
        return x >= 0 && y >= 0 && x < maps[0].length && y < maps.length && maps[y][x] != 0;
    }

    public static class Node {
        private int y, x, depth;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDepth() {
            return depth;
        }

        public Node(int y, int x, int depth) {
            this.y = y;
            this.x = x;
            this.depth = depth;
        }
    }
}
