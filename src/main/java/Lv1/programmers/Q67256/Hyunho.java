package Lv1.programmers.Q67256;

import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    //1.94ms, 76.4MB - 4.27ms, 73.3MB
    public String solution(int[] numbers, String hand) {
        String answer = "";

        //번호별 좌표(위치) 저장
        Map<Integer, int[]> keyboard = new HashMap<>();
        keyboard.put(0, new int[]{0, 1});
        keyboard.put(1, new int[]{3, 0});
        keyboard.put(2, new int[]{3, 1});
        keyboard.put(3, new int[]{3, 2});
        keyboard.put(4, new int[]{2, 0});
        keyboard.put(5, new int[]{2, 1});
        keyboard.put(6, new int[]{2, 2});
        keyboard.put(7, new int[]{1, 0});
        keyboard.put(8, new int[]{1, 1});
        keyboard.put(9, new int[]{1, 2});
        keyboard.put(10, new int[]{0, 0});
        keyboard.put(11, new int[]{0, 2});

        int leftHand = 10;
        int rightHand = 11;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                leftHand = num;
                answer += "L";
                continue;
            }
            if (num == 3 || num == 6 || num == 9) {
                rightHand = num;
                answer += "R";
                continue;
            }

            //눌러야할 번호와 엄지 손가락 좌표를 가져옴
            int[] numPosition = keyboard.get(num);
            int[] leftPosition = keyboard.get(leftHand);
            int[] rightPosition = keyboard.get(rightHand);

            //엄지손가락이 이동 해야 할 수 계산
            int leftMoveCount = Math.abs(numPosition[0] - leftPosition[0]) + Math.abs(numPosition[1] - leftPosition[1]);
            int rightMoveCount = Math.abs(numPosition[0] - rightPosition[0]) + Math.abs(numPosition[1] - rightPosition[1]);

            //최소한으로 이동이 가능한 엄지 손가락을 선책 하여 이동(이동해야 하는 거리가 같다면 주로 사용하는 손(hand)를 이동)
            if (leftMoveCount < rightMoveCount){
                leftHand = num;
                answer += "L";
            }else if (leftMoveCount > rightMoveCount){
                rightHand = num;
                answer += "R";
            }else {
                if (hand.equals("left")){
                    leftHand = num;
                    answer += "L";
                }else {
                    rightHand = num;
                    answer += "R";
                }
            }
        }
        return answer;
    }
}
