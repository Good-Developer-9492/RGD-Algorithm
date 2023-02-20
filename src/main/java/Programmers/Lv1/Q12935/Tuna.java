package Programmers.Lv1.Q12935;

public class Tuna {
    // (0.03ms, 75MB)
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{ -1 };
        }

        int minLoc = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                minLoc = i;
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];

        int loc = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == minLoc) continue;
            answer[loc++] = arr[i];
        }

        return answer;
    }
}
