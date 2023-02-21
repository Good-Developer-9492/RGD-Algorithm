package Lv1.programmers.Q159994;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Hyunho {
    //0.17ms, 83.2MB - 1.62ms, 78.6MB
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> card1Queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2Queue = new LinkedList<>(Arrays.asList(cards2));
        for (String word : goal) {
            String card1 = card1Queue.peek();
            String card2 = card2Queue.peek();
            if (verifySameWord(card1, word)) {
                card1Queue.poll();
                continue;
            }
            if (verifySameWord(card2, word)) {
                card2Queue.poll();
                continue;
            }
            return "No";
        }
        return "Yes";
    }
    private boolean verifySameWord(String s1, String s2){
        return s1 != null && s1.equals(s2);
    }
}
