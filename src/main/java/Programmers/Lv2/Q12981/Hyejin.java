package Programmers.Lv2.Q12981;

import java.util.ArrayList;
import java.util.List;

public class Hyejin {

    public int[] solution(int n, String[] words) {
        List<String> lastWords = new ArrayList<>();
        //첫번째 단어는 체크하지 않는다
        lastWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (failWordGame(lastWords, words[i])) {
                return calculateTurn(n, i);
            }
            lastWords.add(words[i]);
        }
        return new int[]{0, 0};
    }

    private boolean failWordGame(List<String> lastWords, String word) {
        String lastWord = lastWords.get(lastWords.size() - 1);
        //마지막글자와 첫글자 비교 || 지난글자들에 현재 문자가 있는지
        return
            lastWord.charAt(lastWord.length() - 1) != word.charAt(0)
            || lastWords.contains(word);
    }

    private int[] calculateTurn(int n, int i) {
        return new int[]{(i % n)+1, (i / n) + 1};
    }


}
