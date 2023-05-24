package Programmers.Lv2.Q154540;

import java.util.*;

public class Hyunho {
    //["X591X","X1X5X","X231X", "1XXX1"]
    //X 5 9 1 X
    //X 1 X 5 X
    //X 2 3 1 X
    //1 X X X 1
    int[] dr = {0, 0, -1, 1};
    int[] dc = {-1, 1, 0, 0};

    //["X591X","X1X5X","X231X", "1XXX1"]
    public int[] solution(String[] maps) {
        //각 섬에서 최대 며칠씩 머무를 수 있는지 배열에 오름차순으로 담아 return
        MapInfo mapInfo = new MapInfo(maps);
        VisitHistory visited = new VisitHistory(mapInfo.rowLength(), mapInfo.columnLength());
        List<Integer> foodSumList = new ArrayList<>();
        Queue<Point> visitedQueue = new LinkedList<>();

        boolean flag = false;
        for (int i = 0; i < mapInfo.rowLength(); i++) {
            for (int j = 0; j < mapInfo.columnLength(); j++) {
                if (visited.position(i, j) || mapInfo.verifyEmptyPoint(i, j)) {
                    continue;
                }

                flag = true;
                foodSumList.add(bfs(new Point(i, j), mapInfo, visitedQueue, visited));
            }
        }

        if (!flag) {
            return new int[]{-1};
        }

        Collections.sort(foodSumList);

        return foodSumList.stream()
            .mapToInt(i -> i)
            .toArray();
    }

    private int bfs(Point currentPoint, MapInfo mapInfo, Queue<Point> visitedQueue, VisitHistory visited) {
        visitedQueue.add(currentPoint);
        visited.changeStatusPosition(currentPoint.getRow(), currentPoint.getColumn());

        int sumFoodQuantity = mapInfo.foodQuantityToInteger(currentPoint.row, currentPoint.column);

        while (!visitedQueue.isEmpty()) {
            Point point = visitedQueue.poll();

            for (int i = 0; i < 4; i++) {
                int row = point.getRow() + dr[i];
                int column = point.getColumn() + dc[i];

                if (mapInfo.checkEndPointAndOutOfBound(row, column, visited.visited)) {
                    continue;
                }

                if (mapInfo.verifyEmptyPoint(row, column)) {
                    continue;
                }

                visited.changeStatusPosition(row, column);
                sumFoodQuantity += mapInfo.foodQuantityToInteger(row, column);
                visitedQueue.add(new Point(row, column));
            }
        }

        return sumFoodQuantity;
    }


    static class Point {
        private final int row;
        private final int column;

        private Point(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

    static class MapInfo {
        private final String[] maps;

        public MapInfo(String[] maps) {
            this.maps = maps;
        }

        public int rowLength() {
            return this.maps.length;
        }

        public int columnLength() {
            return this.maps[0].length();
        }

        public int foodQuantityToInteger(int row, int column) {
            return this.maps[row].charAt(column) - '0';
        }

        public boolean verifyEmptyPoint(int row, int column) {
            return this.maps[row].charAt(column) == 'X';
        }


        public boolean checkEndPointAndOutOfBound(int row, int column, boolean[][] visited) {
            return row < 0 ||
                column < 0 ||
                row >= this.rowLength() ||
                column >= this.columnLength() ||
                visited[row][column];
        }
    }

    static class VisitHistory {
        private final boolean[][] visited;

        public VisitHistory(int rowLength, int columnLength) {
            this(new boolean[rowLength][columnLength]);
        }

        public VisitHistory(boolean[][] visited) {
            this.visited = visited;
        }

        public boolean position(int low, int colum) {
            return this.visited[low][colum];
        }

        public void changeStatusPosition(int row, int column) {
            this.visited[row][column] = true;
        }
    }
}
