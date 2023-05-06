package Programmers.Lv2.Q72411;

import java.util.*;

public class Tuna {
    // orders 별로 나올 수 있는 경우의 수 저장
    private static Map<Integer, Set<String>> map;
    // 전체 경우의 수
    private static Set<String> set;
    // 전체 course
    private static Set<Integer> courses;

    public String[] solution(String[] orders, int[] course) {
        map = new HashMap<>();
        set = new HashSet<>();
        courses = new HashSet<>();

        for (int num : course) {
            courses.add(num);
        }

        for (int i = 0; i < orders.length; i++) {
            char[] tmp = orders[i].toCharArray();
            Arrays.sort(tmp);
            recursive("", -1, tmp, i);
        }

        List<String> list = new ArrayList<>();
        for (String str : set) {
            int cnt = 0;
            for (int i = 0; i < orders.length; i++) {
                if (cnt > 1) {
                    list.add(str);
                    break;
                }

                Set<String> orderSet = map.get(i);
                if (orderSet.contains(str)) {
                    cnt++;
                }
            }
        }

        List<String> list2 = new ArrayList<>(list);
        for (String str : list) {
            map.put(100, new HashSet<>());
            recursive("", -1, str.toCharArray(), 100);
            for (String tmp : map.get(100)) {
                list.remove(tmp);
            }
        }

        String[] answer = list.toArray(String[]::new);
        Arrays.sort(answer);
        for (String str : answer) {
            System.out.println(str);
        }
        return answer;
    }

    // 경우의 수 조합해주는 함수 (order가 주어지면, 해당 order에서 나올 수 있는 조합)
    private static void recursive(String now, int nowIdx, char[] order, int idx) {
        if (courses.contains(now.length())) {
            Set<String> idxSet = map.getOrDefault(idx, new HashSet<>());
            idxSet.add(now);
            map.put(idx, idxSet);
            set.add(now);
        }

        for (int i = nowIdx + 1; i < order.length; i++) {
            recursive(now + order[i], i, order, idx);
        }
    }
}
