package Programmers.Lv2.Q131701;

import java.util.HashSet;
import java.util.Set;

public class Tuna {
    // (300ms / 110MB)
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        // 길이 1부터 끝까지
        for (int i = 1; i <= elements.length; i++) {
            // 합을 구하는 시작위치
            for (int j = 0; j < elements.length; j++) {
                // 구해온 값은 Set에 추가 (중복제거)
                set.add(getSum(elements, j, i));
            }
        }

        return set.size();
    }

    // 주어진 배열에서 시작위치부터 길이만큼 더해줄 메소드
    private int getSum(int[] elements, int start, int length) {
        int sum = 0;

        for (int i = start; i < start + length; i++) {
            // 찾는 원소의 위치가 주어진 배열을 넘어가면 0부터 다시시작 (원형수열이므로)
            if (i >= elements.length) {
                sum += elements[i - elements.length];
                continue;
            }
            sum += elements[i];
        }

        return sum;
    }
}
