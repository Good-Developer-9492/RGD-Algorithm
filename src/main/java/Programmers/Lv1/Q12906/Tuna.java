package Programmers.Lv1.Q12906;

import java.util.ArrayList;

public class Tuna {
    // 정확성 (0.05ms, 74MB), 효율성 (25ms, 115MB)
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
