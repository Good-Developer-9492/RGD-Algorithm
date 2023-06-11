package Programmers.Lv2.Q86971;

import java.util.LinkedList;
import java.util.Queue;

public class Hyejin {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int[][] tree = new int[n + 1][n + 1];
        //트리 만들기
        for (int i = 0; i < wires.length; i++) {
            tree[wires[i][0]][wires[i][1]] = 1;
            tree[wires[i][1]][wires[i][0]] = 1;
        }

        int x, y;
        for (int i = 0; i < wires.length; i++) {
            x = wires[i][0];
            y = wires[i][1];

            //전력망 하나 끊기
            tree[x][y] = 0;
            tree[y][x] = 0;

            //송전탑 수 확인하기
            answer = Math.min(answer, bfs(tree, n, x));

            //전력망 되돌리기
            tree[x][y] = 1;
            tree[y][x] = 1;
        }

        return answer;
    }

    private int bfs(int[][] tree, int n, int x) {
        int[] visited = new int[n + 1];
        int cnt = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);

        while (!q.isEmpty()) {
            int point = q.poll();
            visited[point] = 1;

            for (int i = 1; i <= n; i++) {
                if (visited[i] == 1) continue;
                if (tree[point][i] == 1) {
                    q.offer(i);
                    cnt++;
                }
            }
        }
        return Math.abs(n - 2 * cnt) ;//송전탑 개수
    }
}
