package Programmers.Lv2.Q70129;

public class Tuna {
    // (0.06ms ~ 8.71ms / 71MB ~ 89MB)
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        // 삭제된 0의 개수 저장
        int zeroCount = 0;
        // 변환된 횟수 저장
        int convertCount = 0;
        // "1"로 종료하기 전까지 반복
        while (!sb.toString().equals("1")) {
            // 1의 개수 저장 (0이 제거되고 남은 1들의 length를 위해)
            int oneCount = 0;
            // 0과 1의 개수 추가
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }

            // String 초기화
            sb = new StringBuilder();

            // 2진수 처리
            while (oneCount > 0) {
                sb.insert(0, oneCount % 2);
                oneCount /= 2;
            }

            // 변환 횟수 추가
            convertCount++;
        }

        // 결과 출력
        return new int[]{convertCount, zeroCount};
    }
}
