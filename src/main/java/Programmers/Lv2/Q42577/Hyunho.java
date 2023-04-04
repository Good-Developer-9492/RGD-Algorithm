package Programmers.Lv2.Q42577;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    //1788.41ms, 335MB
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        Map<String, String> hm = new HashMap<>();
        for (String str : phone_book) {
            if (hm.get(str) != null) {
                return false;
            }
            for (int i = 1, len = str.length() ; i <= len; i++) {
                hm.put(str.substring(0, i), "");
            }
        };
        return true;
    }
}
