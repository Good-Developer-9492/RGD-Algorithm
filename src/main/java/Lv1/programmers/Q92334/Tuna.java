package Lv1.programmers.Q92334;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuna {
    // (0.1ms ~ 266.09ms / 68.1MB ~ 167MB)
    public int[] solution(String[] id_list, String[] report, int k) {
        // 사용자가 신고한 사람을 모아둘 Map
        Map<String, List<String>> map = new HashMap<>();
        // 사용자가 신고당한 횟수를 기록할 Map
        Map<String, Integer> count = new HashMap<>();

        // 신고내역을 순회하며 Map을 기록
        for (String r : report) {
            String[] temp = r.split(" ");

            List<String> list = map.getOrDefault(temp[0], new ArrayList<>());
            // 동일한 유저에게 신고당한 기록이 있으면 Skip (동일한 유저에 대한 신고횟수는 1회로 처리된다.)
            if (list.contains(temp[1])) continue;

            // 신고한 사람 기록
            list.add(temp[1]);
            map.put(temp[0], list);
            // 신고당한 횟수 기록
            count.put(temp[1], count.getOrDefault(temp[1], 0) + 1);
        }

        int[] answer = new int[id_list.length];

        // 사용자 목록 순회하며 기록을 보고 받은 처리메일 수 파악
        for (int i = 0; i < id_list.length; i++) {
            // 신고한 사람 기록 가져오기
            List<String> reported = map.getOrDefault(id_list[i], new ArrayList<>());
            // 비어있다면 Skip
            if (reported.isEmpty()) continue;

            // 신고한 사람들이 정지되었는지 확인
            for (String s : reported) {
                // 정지되었다면 받은 처리메일 수 + 1
                if (count.get(s) >= k) answer[i]++;
            }
        }

        return answer;
    }
}
