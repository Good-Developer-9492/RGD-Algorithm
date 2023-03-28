package Programmers.Lv2.Q17677;

public class Tuna {
    // (0.21ms ~ 75.97ms / 72.8MB ~ 137MB)
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // 교집합에 이미 포함된 문자열인지 확인할 배열
        boolean[] check = new boolean[str2.length() - 1];

        // 교집합 개수
        int intersection = 0;
        // 합집합 개수
        int union = 0;

        A: for (int i = 0; i < str1.length() - 1; i++) {
            String subStr1 = str1.substring(i, i + 2);
            // 알파뱃 소문자로만 이루어진 문자열인지 판단
            if (isLowerAlphabet(subStr1)) continue;

            for (int j = 0; j < str2.length() - 1; j++) {
                // 이미 한번 교집합으로 포함된 문자열인지 판단
                if (check[j]) continue;
                String subStr2 = str2.substring(j, j + 2);
                if (isLowerAlphabet(subStr2)) continue;

                // 두 문자열이 같다면 교집합에도 더해주기
                if (subStr1.equals(subStr2)) {
                    intersection++;
                    union++;
                    check[j] = true;
                    continue A;
                }
            }

            // 같은 문자열이 발견되지 않는다면 문자열1만 합집합에 넣어주기
            union++;
        }

        // 교집합에 들어가지 않았고 조건에 충족하는 문자열2를 합집합에 넣어주기
        for (int i = 0; i < str2.length() - 1; i++) {
            if (check[i]) continue;
            if (isLowerAlphabet(str2.substring(i, i + 2))) continue;
            union++;
        }
        // 정답 계산
        return (int) (intersection == 0 && union == 0 ? 65536 : (double) intersection / union * 65536);
    }

    private boolean isLowerAlphabet(String str) {
        return !str.matches("[a-z]+");
    }
}
