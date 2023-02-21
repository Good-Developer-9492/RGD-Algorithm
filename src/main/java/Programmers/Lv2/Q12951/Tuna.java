package Programmers.Lv2.Q12951;

public class Tuna {
    // (0.1ms / 75MB)
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        // 전부 소문자로 초기화
        s = s.toLowerCase();

        // 문자열 순회, 문자열 내에 들어있는 모든 공백을 컨트롤하기 위해 split(" ", -1)
        for (String str : s.split(" ", -1)) {
            // 공백이면 공백만 추가하고 넘어가기
            if (str.length() == 0) {
                sb.append(" ");
                continue;
            }

            // 첫문자가 소문자면 대문자로 변경
            if (str.charAt(0) >= 97 && str.charAt(0) <= 122) {
                sb.append((char) (str.charAt(0) - 32));
            } else sb.append(str.charAt(0));

            // 첫문자를 제외한 나머지 문자 추가
            sb.append(str.substring(1));
            // split을 통해 제거된 문자 사이의 " " 추가
            sb.append(" ");
        }

        // 마지막에 문자 사이의 " " 추가로 인해 하나 더해진 " " 제거후 제출
        return sb.substring(0, sb.length() - 1);
    }
}
