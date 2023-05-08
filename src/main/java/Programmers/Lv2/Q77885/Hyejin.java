package Programmers.Lv2.Q77885;

public class Hyejin {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            //짝수일 경우
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                continue;
            }
            //홀수일 경우
            else {
                //2진수 변환
                StringBuilder sb = new StringBuilder(Long.toBinaryString(numbers[i]));

                //0을 미포함하면 ->  2번째 자리에 0을 삽입
                if (sb.indexOf("0") == -1) {
                    sb.insert(1, "0");
                } else {
                    //0을 포함하면 -> 마지막 0을 1로 바꾸고 그 뒤에 1을 0으로 바꾸기
                    int zeroIdx = sb.lastIndexOf("0");
                    int oneIdx = sb.indexOf("1", zeroIdx);
                    sb.replace(zeroIdx, zeroIdx + 1, "1");
                    sb.replace(oneIdx, oneIdx + 1, "0");
                }
                answer[i] = Long.parseLong(sb.toString(),2);
            }
        }
        return answer;
    }
}
