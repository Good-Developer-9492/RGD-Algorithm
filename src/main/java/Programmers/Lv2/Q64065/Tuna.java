package Programmers.Lv2.Q64065;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Tuna {
    // (3ms ~ 30ms / 75MB ~ 100MB)
    public int[] solution(String s) {
        // },{로 split
        String[] split1 = s.split("},\\{");

        // 맨앞의 {{, 맨뒤의 }} 제거
        split1[0] = split1[0].replace("{{", "");
        split1[split1.length - 1] = split1[split1.length - 1].replace("}}", "");

        // 길이 순으로 정렬
        Arrays.sort(split1, Comparator.comparingInt(String::length));

        // Set에 넣어가면서 없는거 추가
        Set<String> set = new HashSet<>();
        int tupleSize = split1[split1.length - 1].split(",").length;
        int[] answer = new int[tupleSize];
        int idx = 0;
        for (String str1 : split1) {
            String[] split2 = str1.split(",");

            for (String str2 : split2) {
                if (set.contains(str2)) continue;

                answer[idx] = Integer.parseInt(str2);
                idx++;
                set.add(str2);
            }
        }

        return answer;
    }
}
