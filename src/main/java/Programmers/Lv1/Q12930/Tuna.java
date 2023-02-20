package Programmers.Lv1.Q12930;

public class Tuna {
    public String solution(String s) {
        // (0.2ms, 75MB)
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            if (str.isBlank()) {
                sb.append(" ");
                continue;
            }
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    temp.append(str.substring(i, i + 1).toUpperCase());
                } else {
                    temp.append(str.substring(i, i + 1).toLowerCase());
                }
            }
            sb.append(temp);
            sb.append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}
