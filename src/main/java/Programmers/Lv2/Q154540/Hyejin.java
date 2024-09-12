package Programmers.Lv2.Q154540;

import java.util.*;

public class Hyejin {
    //상하좌우 이동
    int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    List<Integer> foods = new ArrayList<>();
    int[][] map;
    boolean[][] visited;

    public int[] solution(String[] maps) {
        map = new int[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];

        //map 생성
        for (int i = 0; i < maps.length; i++) {
            String[] s = maps[i].split("");
            for (int j = 0; j < s.length; j++) {
                map[i][j] = s[j].equals("X") ? -1 : Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visited[i][j] && map[i][j] > -1) {
                    foods.add(bfs(i, j, map[i][j]));
                }
            }
        }

        foods.sort(Comparator.naturalOrder());
        if (foods.size() == 0) return new int[]{-1};
        return foods.stream().mapToInt(a -> a).toArray();
    }

    private int bfs(int y, int x, int food) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(y);
        q.offer(x);
        visited[y][x] = true;

        while (!q.isEmpty()) {
            int nowY = q.poll();
            int nowX = q.poll();

            for (int i = 0; i < 4; i++) {
                int ny = nowY + move[i][0];
                int nx = nowX + move[i][1];

                if (ny < 0 || nx < 0 || ny >= map.length || nx >= map[0].length) continue;
                if (visited[ny][nx]) continue;
                if (map[ny][nx] == -1) continue;

                q.offer(ny);
                q.offer(nx);
                visited[ny][nx] = true;
                food += map[ny][nx];

            }
        }
        return food;
    }
}
