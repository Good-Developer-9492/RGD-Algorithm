package Programmers.Lv2.Q01844;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tuna {
    // (0.2ms, 5ms / 75MB, 54MB) - 정확성, 효율성 순서
    // DFS로 해결시 시간초과 발생.
    // Queue에서 뽑을때 visited true시 시간초과발생. 넣을때 visited true하면 중복제거
    public int solution(int[][] maps) {
        // 이미 방문한 map을 판단할 visited
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        // 해당 map에 방문하기 위한 최단거리를 표시할 distance
        int[][] distance = new int[maps.length][maps[0].length];
        // 최소값을 찾기 위한 배열의 element 최대값 초기화
        for (int i = 0; i < maps.length; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }

        // 현재위치 행, 현재위치 열, 현재위치 거리 를 가지는 Queue 생성 (BFS용)
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int row = now[0];
            int col = now[1];
            int dist = now[2];
            distance[row][col] = dist;

            if (row == maps.length - 1 && col == maps[0].length - 1) break;

            // 4방향으로 이동시, 이동이 가능한지 체크(현재 위치가 끝인지, 이미 방문한 적이 있는지, 벽이 있는지)
            // 위로 이동
            if (row != 0 && !visited[row - 1][col] && maps[row - 1][col] != 0) {
                queue.add(new int[]{row - 1, col, distance[row][col] + 1});
                visited[row - 1][col] = true;
            }

            // 아래로 이동
            if (row != maps.length - 1 && !visited[row + 1][col] && maps[row + 1][col] != 0) {
                queue.add(new int[]{row + 1, col, distance[row][col] + 1});
                visited[row + 1][col] = true;
            }

            // 왼쪽으로 이동
            if (col != 0 && !visited[row][col - 1] && maps[row][col - 1] != 0) {
                queue.add(new int[]{row, col - 1, distance[row][col] + 1});
                visited[row][col - 1] = true;
            }

            // 오른쪽으로 이동
            if (col != maps[0].length - 1 && !visited[row][col + 1] && maps[row][col + 1] != 0) {
                queue.add(new int[]{row, col + 1, distance[row][col] + 1});
                visited[row][col + 1] = true;
            }
        }

        // n, m 위치가 초기화된 값인 Integer.MAX_VALUE라면 도달하지 못했음
        if (distance[maps.length - 1][maps[0].length - 1] == Integer.MAX_VALUE) return -1;
        return distance[maps.length - 1][maps[0].length - 1];
    }
}
