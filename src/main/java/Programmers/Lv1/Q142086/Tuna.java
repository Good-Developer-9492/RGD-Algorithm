package Programmers.Lv1.Q142086;

public class Tuna {
    // (1ms, 75MB)
    public int[] solution(String s) {
        String[] arr = s.split("");
        int[] answer = new int[arr.length];

        answer[0] = -1;
        A: for (int i = 1; i < arr.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i].equals(arr[j])) {
                    answer[i] = count;
                    continue A;
                }
                count++;
            }
            answer[i] = -1;
        }

        return answer;
    }
}
