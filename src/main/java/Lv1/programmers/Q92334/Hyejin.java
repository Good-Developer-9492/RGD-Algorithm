package Lv1.programmers.Q92334;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Hyejin {
    public int[] solution(String[] id_list, String[] report, int k) {
        //5.28ms, 72.8MB
        //1194.93ms, 162MB

        int[] answer = new int[id_list.length];
        //신고당한 유저
        Map<String, Integer> reportedUsers = new HashMap<>();
        //신고한 유저
        Map<String, List<String>> notedUsers = new HashMap<>();
        //차단된 유저
        Set<String> blockedUsers = new HashSet<>();

        //notedUser 초기화
        for(String u : id_list){
            notedUsers.put(u,new ArrayList<>());
        }

        //중복신고 제거
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        //정지될 유저들 탐색
        for (String u : report) {
            String[] split = u.split(" ");
            String notedUser = split[0];
            String reportedUser = split[1];

            //유저별 신고한 목록에 넣기
            addNotedUser(notedUsers, notedUser, reportedUser);

            //신고횟수 카운트
            addReportCount(k, reportedUsers, blockedUsers, reportedUser);
        }

        int index = 0;
        //유저별로 신고한 유저가 정지된 횟수를 넣는다
        for(String id : id_list){
            answer[index++] = matchUsersCount(notedUsers, blockedUsers, id);
        }


        return answer;
    }

    private void addReportCount(int k, Map<String, Integer> reportedUsers, Set<String> blockedUsers, String reportedUser) {
        int count = reportedUsers.getOrDefault(reportedUser,0)+1;
        //신고 횟수가 기준치가 넘으면 정지 리스트에 더한다
        if(count >= k) blockedUsers.add(reportedUser);

        reportedUsers.put(reportedUser, count);
    }

    private void addNotedUser(Map<String, List<String>> notedUsers, String notedUser, String reportedUser) {
        List<String> list = notedUsers.get(notedUser);
        list.add(reportedUser);

        notedUsers.put(notedUser,list);
    }

    private int matchUsersCount(Map<String, List<String>> notedUsers, Set<String> blockedUsers, String id) {
        List<String> users = notedUsers.get(id).stream()
            .filter(u -> blockedUsers.stream().anyMatch(Predicate.isEqual(u))).collect(Collectors.toList());
        return users.size();
    }



}
