package Programmers.Lv2.Q17677;

import java.util.*;

public class Hyejin {
    //0.06ms, 71.2MB
    // 21.89ms, 78.6MB
    public int solution(String str1, String str2) {
        List<String> arr = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr = makeArr(arr, str1);
        arr2 = makeArr(arr2, str2);

        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>(arr);

        for (int i = 0; i < arr.size(); i++) {
            int arr2Idx = arr2.indexOf(arr.get(i));

            if (arr2Idx >= 0) {
                intersection.add(arr.get(i));
                arr.set(i, "");
                arr2.set(arr2Idx, "");
            }
        }

        //합집합 나머지 더하기
        for (String s : arr2) {
            if (s.equals("")) continue;
            union.add(s);
        }

        if (intersection.size() == 0 && union.size() == 0) return 65536;
        return (int) Math.floor((double) intersection.size() / union.size() * 65536);
    }

    public List<String> makeArr(List<String> arr, String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            if (!Character.isAlphabetic(c1) || !Character.isAlphabetic(c2)) continue;
            arr.add((c1 + "" + c2).toLowerCase(Locale.ROOT));
        }
        return arr;
    }
}
