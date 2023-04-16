package Programmers.Lv2.Q49994;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hyejin {
    //0.35ms, 77MB
    //2.06ms, 77.6MB
    public int solution(String dirs) {
        //중복방문을 허용하지 않는다
        Set<Position> set = new HashSet<>();

        int nowX = 0;
        int nowY = 0;
        for (char c : dirs.toCharArray()) {
            int bx = nowX;
            int by = nowY;
            if (c == 'U') nowY += 1;
            if (c == 'D') nowY -= 1;
            if (c == 'L') nowX -= 1;
            if (c == 'R') nowX += 1;

            //범위 밖으로 이동한 경우
            if (nowX < -5 || nowY < -5 || nowX > 5 || nowY > 5) {
                if (nowX < -5) nowX = -5;
                if (nowX > 5) nowX = 5;
                if (nowY < -5) nowY = -5;
                if (nowY > 5) nowY = 5;
                continue;
            }
            set.add(new Position(bx, by, nowX, nowY));
        }
        //방문한 곳
        return set.size();
    }

    public static class Position {
        //중복을 확인할라면 이전에서 출발한 방향을 알아야 한다
        //이전 방향
        int bx;
        int by;
        //지금 방향
        int x;
        int y;

        public Position(int bx, int by, int x, int y) {
            this.bx = bx;
            this.by = by;
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return (bx == position.bx && by == position.by && x == position.x && y == position.y) ||
                //오른쪽 -> 왼쪽으로 간 길과
                //왼쪽 -> 오른쪽으로 간길은 같은 길
                (bx == position.x && by == position.y && x == position.bx && y == position.by);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bx, by, x, y) +
                //오른쪽 -> 왼쪽으로 간 길과
                //왼쪽 -> 오른쪽으로 간길은 같은 길
                Objects.hash(x, y, bx, by);
        }
    }
}
