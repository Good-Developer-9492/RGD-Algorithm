package Programmers.Lv2.Q42888;

import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    //379.64ms, 298MB
    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : record) {
            String[] arr = str.split(" ");
            switch (arr[0]) {
                case "Enter" -> {
                    stringBuilder.append(arr[1]).append("님이 들어왔습니다.-");
                    userMap.put(arr[1], arr[2]);
                }
                case "Leave" -> stringBuilder.append(arr[1]).append("님이 나갔습니다.-");
                case "Change" -> userMap.put(arr[1], arr[2]);
            }
        }

        String str = stringBuilder.toString();
        String[] result = str.split("-");
        for (int i = 0; i < result.length; i++) {
            String key = result[i].substring(0, result[i].indexOf("님"));
            result[i] = result[i].replaceAll(key, userMap.get(key));
        }

        return result;
    }
}
