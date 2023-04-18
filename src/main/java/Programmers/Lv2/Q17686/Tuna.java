package Programmers.Lv2.Q17686;

import java.util.Arrays;

public class Tuna {
    public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String[] str1 = divideFileName(o1);
            String[] str2 = divideFileName(o2);

            // HEAD가 다르면, HEAD 순으로 정렬 (대소문자 구분없이)
            if (!str1[0].equalsIgnoreCase(str2[0])) {
                return str1[0].compareToIgnoreCase(str2[0]);
            }

            // NUMBER가 다르면, NUMBER 순으로 정렬
            int num1 = Integer.parseInt(str1[1]);
            int num2 = Integer.parseInt(str2[1]);
            if (num1 != num2) {
                return Integer.compare(num1, num2);
            }

            // HEAD, NUMBER가 같다면 TAIL은 신경쓰지 말고 나온 순서대로 정렬
            return 0;
        });

        return files;
    }

    // 파일이름 나누기
    private String[] divideFileName(String file) {
        String[] arr = new String[3];
        int firstNumberIndex = 0;
        int lastNumberIndex = 0;

        // NUMBER 파악 위한 숫자 위치
        for (int i = 0; i < file.length(); i++) {
            if (firstNumberIndex == 0 && isNumber(file.charAt(i))) {
                firstNumberIndex = i;
                lastNumberIndex = i;
            }

            if (firstNumberIndex != 0 && isNumber(file.charAt(i))) {
                lastNumberIndex++;
            }

            if (firstNumberIndex != 0) {
                // 숫자는 최대 5자이므로, 이후로 나오는 건 TAIL
                if (lastNumberIndex >= firstNumberIndex + 5) break;

                // 숫자가 아닌 값이 나오면 종료
                if (!isNumber(file.charAt(i))) break;
            }
        }

        // HEAD
        arr[0] = file.substring(0, firstNumberIndex);
        // NUMBER
        arr[1] = file.substring(firstNumberIndex, Math.min(lastNumberIndex, file.length()));
        // TAIL
        arr[2] = lastNumberIndex >= file.length() ? "" : file.substring(lastNumberIndex);

        return arr;
    }

    private boolean isNumber(char number) {
        return number >= '0' && number <= '9';
    }
}
