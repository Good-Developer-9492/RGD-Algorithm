package Programmers.Lv2.Q77885;

public class Tuna {
    // (10.31ms ~ 109.35ms / 70MB ~ 132MB)
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            // 짝수의 경우 가장 마지막 숫자인 0을 1로 변경하면 (1을 더하면) 1개 bit가 차이가 나므로 종료
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                continue;
            }

            // 홀수의 경우 마지막 0의 위치를 찾아야함
            String bit = Long.toBinaryString(numbers[i]);
            int lastIndexOfZero = bit.lastIndexOf("0");
            // 마지막 0의 위치가 가장 앞인 경우 (3, 7, 15 등 2제곱수에서 1을 뺀 숫자들)
            // 11 -> 101, 111 -> 1011, 1111 -> 10111이 정답
            if (lastIndexOfZero == -1) {
                bit = "10" + "1".repeat(bit.length() - 1);
            }
            // 위의 경우를 제외하고는 마지막 0을 바로 뒤에 있는 1과 자리를 바꿔주면 됨
            // 101 -> 110, 1011 -> 1101, 11011 -> 11101
            else {
                bit = bit.substring(0, lastIndexOfZero) + "10" + bit.substring(lastIndexOfZero + 2);
            }
            // 위치를 변경한 2진수를 다시 10진수로 변경
            answer[i] = Long.parseLong(bit, 2);
        }

        return answer;
    }
}
