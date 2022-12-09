package Lv1.programmers.Q12933;

import java.util.Arrays;

public class Tuna {
    // (3ms, 75MB)
    public long solution(long n) {
        String[] arr = Arrays.stream(String.valueOf(n).split("")).sorted().toArray(String[]::new);

        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer * 10 + Long.parseLong(arr[arr.length - (i + 1)]);
        }

        return answer;
    }
    // (20ms, 80MB)
    // 라이브러리 sort 안쓰려고 했는데 String을 직접적으로 써서 오래걸리고 메모리 소모가 늘어난듯.
    // 배열 사용했으면 좀 덜했을듯
//    public long solution(long n) {
//        String str = "";
//
//        while (n > 0) {
//            if (str.equals("")) {
//                str = String.valueOf(n % 10);
//                n /= 10;
//                continue;
//            }
//
//            boolean flag = false;
//            for (int i = 0; i < str.length(); i++) {
//                flag = false;
//                if (str.charAt(i) - '0' < n % 10) {
//                    str = str.substring(0, i) + (n % 10) + str.substring(i, str.length());
//                    flag = true;
//                    break;
//                }
//            }
//
//            if (!flag) {
//                str = str + (n % 10);
//            }
//
//            n /= 10;
//        }
//
//        return Long.parseLong(str);
//    }
}
