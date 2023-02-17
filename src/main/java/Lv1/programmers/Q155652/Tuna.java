package Lv1.programmers.Q155652;

public class Tuna {
    // (0.08ms / 75MB)
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        int[] skipInteger = new int[skip.length()];
        for (int i = 0; i < skip.length(); i++) {
            skipInteger[i] = skip.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            int sInteger = s.charAt(i);

            for (int j = 0; j < index; j++) {
                sInteger++;
                if (sInteger > 'z') {
                    sInteger = sInteger - 'z' + 'a' - 1;
                }
                for (int value : skipInteger) {
                    if (sInteger == value) {
                        j--;
                        break;
                    }
                }
            }

            sb.append((char) sInteger);
        }

        return sb.toString();
    }
}
