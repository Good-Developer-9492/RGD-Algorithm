package Programmers.Lv1.Q77484;

public class Hyunho {
    //0.04ms, 72.8MB
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int sameCount = 0;

        for (int number : lottos) {
            if (number == 0) {
                zeroCount++;
                continue;
            }

            for (int winNumber : win_nums) {
                if (number == winNumber){
                    sameCount++;
                    break;
                }
            }
        }
        return new int[]{7-Math.max(sameCount+zeroCount,1),7-Math.max(sameCount,1)};
    }
}
