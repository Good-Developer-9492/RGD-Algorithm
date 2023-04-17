package Programmers.Lv2.Q84512;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Tuna {
    // (15ms / 80MB)
    public int solution(String word) {
        // 전체적인 로직은 나올수 있는 모든 경우의 수를 찾아내서, 사전 순으로 정렬한 후 결과 가져오기

        // 주어진 알파벳 모음 배열
        String[] arr = new String[]{"A", "E", "I", "O", "U"};
        // 모든 알파벳 모음을 모으기 위한 Queue
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();

        // Queue 첫 값 넣기
        queue.add("");
        while(!queue.isEmpty()) {
            String str = queue.poll();
            // 뽑아내는게 길이가 최대치인 str이라면, 그 다음을 볼 필요가 없으므로 break
            if (str.length() == 5) break;
            // 주어진 알파벳 모음을 순회
            for (String temp : arr) {
                // Queue에서 뽑아낸 단어에 다음 알파벳 모음을 추가하여 queue, set에 추가
                String next = str + temp;
                queue.add(next);
                set.add(next);
            }
        }

        // Set을 정렬하고 List로 변경한 후 index가져오기
        // toList()로 수정하라는 Warning이 나오는데, 수정하면 프로그래머스에서 런타임오류 (자바 버전문제인듯)
        return set.stream().sorted().toList().indexOf(word) + 1;
    }
}
