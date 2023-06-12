package Programmers.Lv2.Q72411;

import java.util.*;

public class Tuna {
    // (15ms / 80MB)
    // course별로 나올수 있는 경우의 수와, 해당 경우의 수의 count
    private static Map<Integer, Map<String, Integer>> map;
    // 전체 course
    private static Set<Integer> courses;

    public String[] solution(String[] orders, int[] course) {
        map = new HashMap<>();
        courses = new HashSet<>();

        for (int num : course) {
            map.put(num, new HashMap<>());
            courses.add(num);
        }

        for (String order : orders) {
            char[] tmp = order.toCharArray();
            Arrays.sort(tmp);
            recursive("", -1, tmp);
        }

        List<String> list = new ArrayList<>();
        for (int n : courses) {
            int max = 0;
            Map<String, Integer> tmp = map.get(n);
            for (String key : tmp.keySet()) {
                max = Math.max(max, tmp.get(key));
            }

            if (max < 2) continue;
            for (String key : tmp.keySet()) {
                if (tmp.get(key) == max) {
                    list.add(key);
                }
            }
        }

        String[] answer = list.toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }

    // 경우의 수 조합해주는 함수 (order가 주어지면, 해당 order에서 나올 수 있는 조합)
    private static void recursive(String now, int nowIdx, char[] order) {
        if (courses.contains(now.length())) {
            int cnt = map.get(now.length()).getOrDefault(now, 0) + 1;
            map.get(now.length()).put(now, cnt);
        }

        for (int i = nowIdx + 1; i < order.length; i++) {
            recursive(now + order[i], i, order);
        }
    }
}
