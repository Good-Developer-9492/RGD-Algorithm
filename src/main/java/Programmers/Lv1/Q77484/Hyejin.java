package Programmers.Lv1.Q77484;

import java.util.Arrays;

public class Hyejin {
    //2.17ms, 75.6MB
    //3.50ms, 80.1MB
    public int[] solution(int[] lottos, int[] win_nums) {

        int worst = (int) Arrays.stream(lottos)
            .filter(n-> Arrays.stream(win_nums).anyMatch(w-> w==n))
            .count();

        int zeroCnt = (int) Arrays.stream(lottos).filter(n -> n == 0).count();

        int best = worst+zeroCnt;

        return new int[]{Math.min(7 - best, 6), Math.min(7 - worst, 6)};
    }
}
