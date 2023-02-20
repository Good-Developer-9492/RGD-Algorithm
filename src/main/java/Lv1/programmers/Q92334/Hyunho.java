package Lv1.programmers.Q92334;

import java.util.*;

public class Hyunho {
    //0.10ms, 74MB - 439.96ms, 166MB
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> userMap = new HashMap<>();
        Map<String, Integer> userReportCountMap = new HashMap<>();
        for (String s : report) {
            String[] userInfo = s.split(" ");
            List<String> userList = new ArrayList<>();
            if (userMap.get(userInfo[0]) != null){
                userList = userMap.get(userInfo[0]);
            }
            if (userList.contains(userInfo[1])) {
                continue;
            }
            userList.add(userInfo[1]);
            userMap.put(userInfo[0], userList);
            userReportCountMap.put(
                userInfo[1],
                userReportCountMap.getOrDefault(userInfo[1], 0) + 1);
        }
        for (int i = 0; i < id_list.length; i++) {
            List<String> reported = userMap.get(id_list[i]);


            if (reported == null) {
                continue;
            }
            for (String s : reported) {
                if (userReportCountMap.get(s) >= k) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
