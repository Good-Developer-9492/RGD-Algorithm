package Programmers.Lv2.Q42883;

public class Tuna {
    // (0.03ms ~ 7368.02ms / 64.1MB ~ 110MB)
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        // 다음 탐색의 기준이 될 index
        int index = -1;
        // k개의 숫자를 제거한 number - k개의 숫자를 뽑기위한 탐색
        for (int i = 0; i < number.length() - k; i++) {
            // 최대값 초기화
            char max = '0';
            // 기준이 될 index부터 최대값 탐색
            for (int j = index + 1; j <= i + k; j++) {
                // 최대값 탐색
                if (number.charAt(j) > max) {
                    index = j;
                    max = number.charAt(j);
                }
            }
            // 최대값 넣어주기
            sb.append(max);
        }

        return sb.toString();
    }
}
