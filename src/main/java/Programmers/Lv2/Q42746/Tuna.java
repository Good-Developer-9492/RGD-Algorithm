package Programmers.Lv2.Q42746;

import java.util.Arrays;

public class Tuna {
    public String solution(int[] numbers) {
        Integer[] temp = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (n1, n2) -> {
            String s1 = String.valueOf(n1);
            String s2 = String.valueOf(n2);
            System.out.println(s1 + " " + s2);

            for (int i = 0; i < 4; i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    return -1;
                }

                if (s1.charAt(i) < s2.charAt(i)) {
                    return 1;
                }

                if (s1.charAt(i) == s2.charAt(i)) {
                    if (s1.length() == i + 1 && s2.length() == i + 1) return 0;
                    if (s1.length() == i + 1) {
                        for (int j = i + 1; j < s2.length(); j++) {
                            if (s1.charAt(i) < s2.charAt(j)) {
                                return 1;
                            }
                        }
                        return -1;
                    }

                    if (s2.length() == i + 1) {
                        for (int j = i + 1; j < s1.length(); j++) {
                            if (s1.charAt(j) > s2.charAt(i)) {
                                return -1;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 0;
        });

        StringBuilder sb = new StringBuilder();
        for (int number : temp) {
            sb.append(number);
        }

        return sb.toString();
    }
}
