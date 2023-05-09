package Programmers.Lv2.Q131704;

import java.util.Stack;

public class Tuna {
    // (60ms / 130MB)
    public int solution(int[] order) {
        // 1~n까지 순서대로 뽑아올 수 있는 메인 컨테이너 벨트 초기화
        Stack<Integer> mainBelt = new Stack<>();
        for (int i = order.length; i > 0; i--) {
            mainBelt.push(i);
        }
        // 보조 컨테이너 벨트
        Stack<Integer> subBelt = new Stack<>();
        // 트럭에 실린 상자의 개수
        int answer = 0;

        // order 순서대로 진행
        for (int box : order) {
            // 보조가 비어있지 않고, 보조의 최상위가 현재 order일때
            if (!subBelt.isEmpty() && subBelt.peek() == box) {
                // 보조에서 상자를 트럭에 싣음
                subBelt.pop();
                answer++;
                continue;
            }

            // 메인이 비어있지 않을때
            while (!mainBelt.isEmpty()) {
                // 메인의 최상위가 현재 order라면 반복문 종료
                if (mainBelt.peek() == box) break;
                // 메인의 최상위가 현재 order가 아니라면 나올때까지 보조로 옮기기
                subBelt.push(mainBelt.pop());
            }

            // 메인이 비어있어서 위 반복문이 종료된 경우, 원하는 순서대로 모두 싣지 못함으로 종료
            if (mainBelt.isEmpty()) break;
            // 메인이 비어있지 않은 경우, 메인의 최상위 상자를 트럭에 싣음
            mainBelt.pop();
            answer++;
        }

        return answer;
    }
}
