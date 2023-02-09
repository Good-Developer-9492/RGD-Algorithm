package Lv1.programmers.Q67256;

public class Hyejin {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lastL = -1;
        int lastR = -2;

        for (int n : numbers) {
            //왼손이 움직여야 할 경우
            if (n == 1 || n == 4 || n == 7) {
                lastL = n;
                answer += "L";
                continue;
            }
            //오른손이 움직여야 할 경우
            if (n == 3 || n == 6 || n == 9) {
                lastR = n;
                answer += "R";
                continue;
            }
            //둘 중가까운 손이 이동한다
            String now = getCloserHand(lastL, lastR, n, hand);
            answer += now;
            if(now.equals("R")) lastR = n;
            else lastL = n;


        }
        return answer;
    }

    private String getCloserHand(int left, int right, int goal, String hand) {
        int[][] map = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
        int lx = -1;
        int ly = -1;
        int rx = -1;
        int ry = -1;
        int gx = -1;
        int gy = -1;
        case1:
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == left) {
                    lx = j;
                    ly = i;
                }
                if (map[i][j] == right) {
                    rx = j;
                    ry = i;
                }
                if (map[i][j] == goal) {
                    gx = j;
                    gy = i;
                }
                //셋다 좌표 채웠으면 for문 나오기
                if (lx > -1 && rx > -1 && gx > -1) break case1;
            }
        }

        int lDistance = mDistance(lx, ly, gx, gy);
        int rDistance = mDistance(rx, ry, gx, gy);

        //가까운 손을 반환
        if (lDistance > rDistance) return "R";
        if (rDistance > lDistance) return "L";
        return hand.equals("right") ? "R" : "L";
    }

    //맨해튼 거리 공식
    private int mDistance(int x, int y, int nx, int ny) {
        return Math.abs(y - ny) + Math.abs(x - nx);
    }


}
