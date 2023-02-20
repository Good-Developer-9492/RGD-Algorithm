package Programmers.Lv1.Q67256;

public class Tuna {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        // 첫 왼손 위치
        int left = 10;
        // 첫 오른손 위치
        int right = 12;
        for (int number : numbers) {
            switch (number) {
                // 왼손이 누르는 키패드 고정
                case 1, 4, 7 -> {
                    sb.append("L");
                    left = number;
                }
                // 오른손이 누르는 키패드 고정
                case 3, 6, 9 -> {
                    sb.append("R");
                    right = number;
                }
                case 2, 5, 8, 0 -> {
                    // 각 숫자가 0일 경우 11로 수정
                    number = number == 0 ? 11 : number;
                    // 수직적 차이 구하기: 1을 뺀 값에 3으로 나누면 라인이 어디인지 나옴
                    int leftVerticalDiff = Math.abs((left - 1) / 3 - (number - 1) / 3);
                    int rightVerticalDiff = Math.abs((right - 1) / 3 - (number - 1) / 3);
                    // 수평적 차이 구하기: 1을 뺀 값에 3으로 나눈 나머지를 구하면 위치가 어디인지 나옴
                    int leftHorizonDiff = Math.abs((left - 1) % 3 - (number - 1) % 3);
                    int rightHorizonDiff = Math.abs((right - 1) % 3 - (number - 1) % 3);
                    // 수직적 차이와 수평적 차이를 더해서 왼손과 오른손이 당도할 거리를 구하기
                    int leftDiff = leftVerticalDiff + leftHorizonDiff;
                    int rightDiff = rightVerticalDiff + rightHorizonDiff;
                    // 왼손과 오른손 거리 비교해서 가까운 친구가 이동
                    if (leftDiff > rightDiff) {
                        sb.append("R");
                        right = number;
                    } else if (leftDiff < rightDiff) {
                        sb.append("L");
                        left = number;
                    } else { // 거리가 동일할 경우 왼손잡이 인지 오른손잡이 인지 비교
                        if (hand.equals("left")) {
                            sb.append("L");
                            left = number;
                        } else {
                            sb.append("R");
                            right = number;
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}
