package Lv1.programmers.Q17681;

public class Tuna {
    // (0.4ms, 75MB)
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for (int i = 0; i < n; i++) {
            map1[i] = toBinary(n, arr1[i]);
            map2[i] = toBinary(n, arr2[i]);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    private static String toBinary(int n, int num) {
        StringBuilder sb = new StringBuilder();

        while(num > 0) {
            sb.insert(0, num % 2);
            num /= 2;
        }

        while(sb.length() < n) {
            sb.insert(0, "0");
        }

        return sb.toString();
    }
}
