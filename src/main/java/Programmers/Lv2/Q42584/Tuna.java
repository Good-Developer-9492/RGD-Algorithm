package Programmers.Lv2.Q42584;

public class Tuna {
    // (0.02ms ~ 17.85ms / 62.3MB ~ 80.4MB)
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[j] < prices[i]) break;
            }
            answer[i] = count;
        }

        return answer;
    }
}
