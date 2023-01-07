package Lv1.programmers.Q17681;

//6.39ms, 75.8MB
public class Hyejin {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            String format = String.format("%1$" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]).replace(' ', '0'));
            char[] chars = format.toCharArray();

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < chars.length; j++) {
                String s = chars[j] == '1' ? "#" : " ";
                sb.append(s);
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}
