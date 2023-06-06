package Programmers.Lv2.Q17687;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tuna {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        // 현재 차례가 누구인지 알려줄 변수
        int currentOrder = 1;
        // 현재 숫자가 무엇인지 알려줄 변수
        int currentNumber = 0;
        // 순서대로 숫자를 저장할 Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("0");
        // 답을 구할 반복문
        while (answer.length() < t) {
            String nowNum = queue.poll();

            // 튜브의 차례라면 현재값을 문자열에 넣기
            if (currentOrder == p) {
                answer.append(nowNum);
            }

            // 현재 숫자를 모두 소모했으면 다음 숫자를 n진수로 변경 후 queue에 넣기
            if (queue.isEmpty()) {
                String nBaseStr = Integer.toUnsignedString(++currentNumber, n);
                queue.addAll(Arrays.asList(nBaseStr.split("")));
            }

            // 현재 차례가 마지막 순서라면 가장 처음 순서의 사람으로 초기화
            if (currentOrder == m) {
                currentOrder = 1;
            } else {
                currentOrder++;
            }
        }

        // 영어로 값이 출력되는 진수의 경우 대문자로 변경
        return answer.toString().toUpperCase();
    }
}
