package Programmers.Lv1.Q17681;

public class Hyunho {
    //1.96ms, 83.3MB
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            String tempString = merge(
                matchingDigits(n, s1),
                matchingDigits(n, s2));

            answer[i] = tempString.replace("1", "#")
                .replace("0", " ");
        }
        return answer;
    }

    private String matchingDigits(int maxlength, String s) {
        int gap = maxlength - s.length();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < gap; i++) {
            temp.append("0");
        }

        return temp.toString() + s;
    }

    private String merge(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
                stringBuilder.append("1");
                continue;
            }
            stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }
}
