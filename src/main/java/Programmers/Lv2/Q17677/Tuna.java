package Programmers.Lv2.Q17677;

public class Tuna {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int intersection = 0;
        int union = 0;

        for (int i = 0; i < str1.length() - 1; i++) {
            String subStr1 = str1.substring(i, i + 2);
            System.out.println(subStr1);
        }

        int answer = 0;
        return answer;
    }

    private boolean isLowerAlphabet(String str) {
        return str.contains("[^a-z]");
    }
}
