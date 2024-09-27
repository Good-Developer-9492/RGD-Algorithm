package Programmers.Lv2.Q60058;

public class Tuna {
    // (1ms / 72MB)
    public String solution(String p) {
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if (p.isBlank()) return "";

        String answer = "";
        // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다.
        // 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
        for (int i = 1; i <= p.length(); i++) {
            if (isBalanced(p.substring(0, i))) {
                answer = recursive(p.substring(0, i), p.substring(i));
                break;
            }
        }
        return answer;
    }

    private String recursive(String u, String v) {
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if (u.isBlank()) return "";
        StringBuilder sb = new StringBuilder();

        // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
        if (isCorrected(u)) {
            sb.append(u);
            // 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
            if (v.isBlank()) {
                sb.append(v);
            } else {
                for(int i = 1; i <= v.length(); i++) {
                    if (isBalanced(v.substring(0, i))) {
                        sb.append(recursive(v.substring(0, i), v.substring(i)));
                        break;
                    }
                }
            }
        } else { // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
            // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            sb.append("(");
            // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            for (int i = 1; i <= v.length(); i++) {
                if (isBalanced(v.substring(0, i))) {
                    sb.append(recursive(v.substring(0, i), v.substring(i)));
                    break;
                }
            }
            // 4-3. ')'를 다시 붙입니다.
            sb.append(")");
            // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            for (int i = 1; i < u.length() - 1; i++) {
                if (u.charAt(i) == '(') sb.append(")");
                else sb.append("(");
            }
        }

        // 4-5. 생성된 문자열을 반환합니다.
        return sb.toString();
    }

    // 균형잡힌 괄호 문자열인지 판별하는 함수
    private boolean isBalanced(String p) {
        int cnt = 0;
        for (char c : p.toCharArray()) {
            if (c == '(') cnt++;
            if (c == ')') cnt--;
        }

        // (와 )의 개수만 동일하면 됨
        return cnt == 0;
    }

    // 올바른 괄호 문자열인지 판별하는 함수
    private boolean isCorrected(String p) {
        int cnt = 0;

        for (char c : p.toCharArray()) {
            if (c == '(') cnt++;
            if (c == ')') cnt--;
            // 중간에 -가 되면 (가 없는 )가 존재한다는 뜻이므로 올바르지 않음
            if (cnt < 0) return false;
        }

        return cnt == 0;
    }
}
