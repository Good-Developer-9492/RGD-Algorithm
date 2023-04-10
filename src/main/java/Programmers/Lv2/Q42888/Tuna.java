package Programmers.Lv2.Q42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuna {
    public String[] solution(String[] record) {
        // 변경되는 닉네임을 저장할 UID-닉네임 Map
        Map<String, String> nicknameMap = new HashMap<>();
        // 순서대로 들어오고 나간 것을 기록할 List
        List<String[]> list = new ArrayList<>();

        for (String details : record) {
            String[] detail = details.split(" ");

            // 첫 값은 action (Enter, Leave, Change)
            switch (detail[0]) {
                case "Enter" -> {
                    // Enter는 UID에 따른 닉네임을 저장 및 들어온 기록 남기기
                    nicknameMap.put(detail[1], detail[2]);
                    list.add(new String[]{detail[0], detail[1]});
                }
                case "Leave" ->
                    // Leave는 닉네임 저장 X, 나간 기록 남기기
                    list.add(new String[]{detail[0], detail[1]});
                case "Change" ->
                    // Change는 닉네임 저장만, 기록은 남기지않음
                    nicknameMap.replace(detail[1], detail[2]);
                default -> {
                }
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String[] element = list.get(i);
            // 들어오고 나간 기록을 토대로 문자열 생성
            answer[i] = String.format(
                "%s님이 %s.",
                nicknameMap.get(element[1]),
                element[0].equals("Enter") ? "들어왔습니다" : "나갔습니다"
            );
        }
        return answer;
    }
}
