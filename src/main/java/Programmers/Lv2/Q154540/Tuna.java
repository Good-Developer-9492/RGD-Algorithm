package Programmers.Lv2.Q154540;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tuna {
    // (10ms / 80MB)
    public int[] solution(String[] maps) {
        // maps -> map 이차원 배열로 초기화
        char[][] map = new char[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                map[i][j] = maps[i].charAt(j);
            }
        }
        // 해당 노드를 방문했는지 체크할 배열 생성
        boolean[][] checked = new boolean[map.length][map[0].length];

        // 결과를 모을 List
        List<Integer> list = new ArrayList<>();
        // BFS를 진행할 Queue
        Queue<int[]> queue = new LinkedList<>();
        // map의 모든 노드 탐색
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                // 이미 방문한 노드라면 continue
                if (checked[i][j]) continue;
                // 노드값이 X라면 방문할 필요가 없으므로 continue
                if (map[i][j] == 'X') {
                    checked[i][j] = true;
                    continue;
                }

                // 숫자 노드를 방문했을때 해당 노드부터 BFS 진행
                queue.add(new int[]{i, j});
                // 방문 체크
                checked[i][j] = true;
                // 식량이 얼마나 있는지 체크할 sum
                int sum = 0;
                // BFS 진행
                while(!queue.isEmpty()) {
                    int[] tmp = queue.poll();
                    int row = tmp[0];
                    int col = tmp[1];
                    // char값을 int값으로 변환해서 더해줘야 함
                    sum += map[row][col] - '0';

                    // 기본적인 조건은 현재 노드로부터 위, 아래, 왼쪽, 오른쪽 중 방문한 적 없고, 'X'가 아닌 노드 추가
                    // 현재 노드가 가장 위인 경우 조건 추가
                    if (row != 0 && map[row - 1][col] != 'X' && !checked[row - 1][col]) {
                        queue.add(new int[]{row - 1, col});
                        checked[row - 1][col] = true;
                    }

                    // 현재 노드가 가장 아래인 경우 조건 추가
                    if (row != map.length - 1 && map[row + 1][col] != 'X' && !checked[row + 1][col]) {
                        queue.add(new int[]{row + 1, col});
                        checked[row + 1][col] = true;
                    }

                    // 현재 노드가 가장 왼쪽인 경우 조건 추가
                    if (col != 0 && map[row][col - 1] != 'X' && !checked[row][col - 1]) {
                        queue.add(new int[]{row, col - 1});
                        checked[row][col - 1] = true;
                    }

                    // 현재 노드가 가장 오른쪽인 경우 조건 추가
                    if (col != map[0].length - 1 && map[row][col + 1] != 'X' && !checked[row][col + 1]) {
                        queue.add(new int[]{row, col + 1});
                        checked[row][col + 1] = true;
                    }
                }
                // BFS 종료 후 해당 섬이 보유한 식량 총 량을 저장
                list.add(sum);
            }
        }

        // 정렬
        list.sort(Integer::compareTo);
        // list가 비어있다면 -1, 아니면 list를 int[]로 변환하여 return
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(n -> n).toArray();
    }
}
