package Programmers.Lv2.Q42584;

public class Hyejin {
    //0.02ms, 84.4MB
    //16.59ms, 70.6MB
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) break;
            }
            answer[i] = count;
        }
        return answer;

    }
}
