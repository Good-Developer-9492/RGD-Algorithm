package Lv1.programmers.Q12926;

public class Tuna {
    // (0.04ms, 75MB)
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }

            int now = s.charAt(i);

            if (now >= 97 && now <= 122) {
                if (now + n > 122) sb.append((char) (now + n - 'z' + 'a' - 1));
                else sb.append((char) (now + n));
            }

            if (now >= 65 && now <= 90) {
                if(now + n > 90) sb.append((char) (now + n - 'Z' + 'A' - 1));
                else sb.append((char) (now + n));
            }
        }

        return sb.toString();
    }
}
