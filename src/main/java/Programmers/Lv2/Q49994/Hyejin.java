package Programmers.Lv2.Q49994;

public class Hyejin {
    public int solution(String dirs) {
        int answer = 0;
        //UDRL
        int[][] move = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        boolean[][] graph = new boolean[10][10];
        int nowX = 4;
        int nowY = 4;

        for (char c : dirs.toCharArray()) {
            if (c == 'U') {
                nowX = move[0][0];
                nowY = move[0][1];
            }
            if (c == 'D') {
                nowX = move[1][0];
                nowY = move[1][1];
            }
            if (c == 'R') {
                nowX = move[2][0];
                nowY = move[2][1];
            }
            if (c == 'L') {
                nowX = move[3][0];
                nowY = move[3][1];
            }
        }

        return answer;
    }
}
