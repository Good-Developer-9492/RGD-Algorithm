package Programmers.Lv2.Q77885;

public class Hyunho {
    //16.08ms, 89.3MB - 134.79ms, 113MB
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            //짝수 이면 +1 해주면 된다. (짝수 다음 수는 하나 비트 차이남)
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                continue;
            }

            //홀수는 두가지 경우의 수로 이루어짐 1111 로만 이루어진경우, 1011 0이 포함된 경우
            String binary = Long.toString(numbers[i], 2);
            int zeroPosition = binary.lastIndexOf("0");

            //0이 포함된 경우 이루어
            if (zeroPosition != -1) {
                binary = binary.substring(0, zeroPosition) + "10" + binary.substring(zeroPosition + 2);
                answer[i] = Long.parseLong(binary, 2);
                continue;
            }
            //1로만 이루어진 경우
            binary = "10" + binary.substring(1);
            answer[i] = Long.parseLong(binary, 2);
        }

        return answer;
    }
}
