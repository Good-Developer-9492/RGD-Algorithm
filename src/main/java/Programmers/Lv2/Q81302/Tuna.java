package Programmers.Lv2.Q81302;

public class Tuna {
    // (0.05ms / 75MB)
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        // 대기실 개수만큼 반복
        A: // 거리두기를 지키지 않는 응시자가 나올경우 바로 다음 대기실로 이동하기 위해 반복문에 네이밍
        for (int k = 0; k < places.length; k++) {
            String[] place = places[k];
            int row = place.length;
            int col = place[0].length();
            char[][] map = new char[row][col];

            // 대기실 map[][]으로 초기화
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    map[i][j] = place[i].charAt(j);
                }
            }

            // 대기실의 모든 자리를 순회
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // 해당 자리가 응시자일 경우
                    if (map[i][j] == 'P') {
                        // 거리두기 판별 진행
                        if (!validDistance(map, i, j)) {
                            // 거리두기가 지켜지지 않고 있으면 answer 입력
                            answer[k] = 0;
                            // 이후 다음 대기실로 이동
                            continue A;
                        }
                    }
                }
            }
            // 다음 대기실로 이동하지 않았다면 거리두기가 지켜지고 있으므로 answer 입력
            answer[k] = 1;
        }

        return answer;
    }

    // row, col을 기준으로 거리두기 판별
    private boolean validDistance(char[][] map, int row, int col) {
        int maxRow = map.length;
        int maxCol = map[0].length;

        // 거리가 1인 위치들의 거리두기 판별 (해당 위치에 응시자가 있으면 거리두기 실패)
        // (row - 1, col)
        if (row - 1 >= 0 && map[row - 1][col] == 'P') {
            return false;
        }

        // (row, col + 1)
        if (col + 1 < maxCol && map[row][col + 1] == 'P') {
            return false;
        }

        // (row + 1, col)
        if (row + 1 < maxRow && map[row + 1][col] == 'P') {
            return false;
        }

        // (row, col - 1)
        if (col - 1 >= 0 && map[row][col - 1] == 'P') {
            return false;
        }

        // 거리가 2인 위치들의 거리두기 판별 (해당 위치에 응시자가 있다면 그 사이에 파티션이 존재하는지까지 확인)
        // (row - 2, col)
        if (row - 2 >= 0 && map[row - 2][col] == 'P') {
            if (map[row - 1][col] != 'X') return false;
        }

        // (row - 1, col + 1)
        if (row - 1 >= 0 && col + 1 < maxCol && map[row - 1][col + 1] == 'P') {
            if (map[row - 1][col] != 'X' || map[row][col + 1] != 'X') return false;
        }

        // (row, col + 2)
        if (col + 2 < maxCol && map[row][col + 2] == 'P') {
            if (map[row][col + 1] != 'X') return false;
        }

        // (row + 1, col + 1)
        if (row + 1 < maxRow && col + 1 < maxCol && map[row + 1][col + 1] == 'P') {
            if (map[row][col + 1] != 'X' || map[row + 1][col] != 'X') return false;
        }

        // (row + 2, col)
        if (row + 2 < maxRow && map[row + 2][col] == 'P') {
            if (map[row + 1][col] != 'X') return false;
        }

        // (row + 1, col - 1)
        if (row + 1 < maxRow && col - 1 >= 0 && map[row + 1][col - 1] == 'P') {
            if (map[row + 1][col] != 'X' || map[row][col - 1] != 'X') return false;
        }

        // (row, col - 2)
        if (col - 2 >= 0 && map[row][col - 2] == 'P') {
            if (map[row][col - 1] != 'X') return false;
        }

        // (row - 1, col - 1)
        if (row - 1 >= 0 && col - 1 >= 0 && map[row - 1][col - 1] == 'P') {
            if (map[row][col - 1] != 'X' || map[row - 1][col] != 'X') return false;
        }

        // 위의 경우들 중 거리두기 실패한 경우가 안나오면 row, col에 자리한 응시자는 거리두기 성공
        return true;
    }
}
