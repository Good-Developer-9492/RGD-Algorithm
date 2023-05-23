package Programmers.Lv2.Q154540;

import java.util.*;

public class Hyunho {
    //["X591X","X1X5X","X231X", "1XXX1"]
    //X 5 9 1 X
    //X 1 X 5 X
    //X 2 3 1 X
    //1 X X X 1
    boolean[][] visited;
    int[] dr = {0, 0, -1, 1};
    int[] dc = {-1, 1, 0, 0};
    Queue<Point> queue = new LinkedList<>();
    int w;
    int h;


    //["X591X","X1X5X","X231X", "1XXX1"]
    public int[] solution(String[] maps) {
        int[] answer = {};
        //각 섬에서 최대 며칠씩 머무를 수 있는지 배열에 오름차순으로 담아 return
        h = maps.length;
        w = maps[0].length();
        visited = new boolean[h][w];

        List<Integer> list = new ArrayList<>();

        boolean flag = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (visited[i][j] || maps[i].charAt(j) == 'X') {
                    continue;
                }

                flag = true;
                list.add(bfs(i, j, maps));
            }
        }

        if (!flag) {
            return new int[]{-1};
        }

        Collections.sort(list);

        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public int bfs(int row, int column, String[] maps) {
        queue.add(new Point(row, column));
        visited[row][column] = true;
        int sum = maps[row].charAt(column) - '0';

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = point.r + dr[i];
                int nc = point.c + dc[i];

                if (nr < 0 || nc < 0 || nr >= h || nc >= w || visited[nr][nc]) {
                    continue;
                }

                if (maps[nr].charAt(nc) == 'X') {
                    continue;
                }

                visited[nr][nc] = true;
                sum += maps[nr].charAt(nc) - '0';
                queue.add(new Point(nr, nc));
            }
        }

        return sum;
    }


    static class Point {
        private final int r;
        private final int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
