package Programmers.Lv2.Q12981;

import java.util.HashMap;
import java.util.Map;

public class Hyunho {
    //0.03ms, 75.6MB
    public int[] solution(int n, String[] words) {

        Map<String, Integer> wordMap = new HashMap<>();
        String beforeWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            //word(key)가 없다면 값에 1, word(key)이미 존재한다면 값에 +1을 한다.
            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);

            //끝말잇기 전 단어 마지막 알파벳과 현재 단어 첫번째 알파벳이 다르거나 이미 단어가 있을 경우
            if (verifySameAlphabet(beforeWord, word) || wordMap.get(word) > 1) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            beforeWord = word;
        }

        return new int[]{0, 0};
    }

    private boolean verifySameAlphabet(String beforeWord, String currentWord) {
        if (beforeWord.isEmpty()){
            return false;
        }
        return beforeWord.charAt(beforeWord.length() - 1) != currentWord.charAt(0);
    }
}
