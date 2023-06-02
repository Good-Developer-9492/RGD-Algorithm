package Programmers.Lv2.Q17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuna {
    // (4ms / 75MB)
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        // 기본 사전 만들기
        for (int i = 0; i < 26; i++) {
            String alphabet = String.valueOf((char) ('A' + i));
            dictionary.put(alphabet, i + 1);
        }

        // 결과 저장할 List
        List<Integer> answerList = new ArrayList<>();
        // 주어진 문장을 한 단어씩 탐색하기 위해 분할
        String[] msgArr = msg.split("");
        // 반복문에서 벗어난 beforeWord가 필요
        String beforeWord = "";
        // map의 가장 끝 index에 추가하기 위한 값
        int lastIndex = 27;
        for (int i = 0; i < msgArr.length; i++) {
            // 현재 입력과 다음 글자를 합쳐서 판단하기 위한 word
            String word = beforeWord + msgArr[i];
            // 해당 word가 사전에 들어있는지 확인
            Integer num = dictionary.get(word);
            if (num == null) {
                // 사전에 없을 경우
                // 현재 입력을 결과에 추가
                answerList.add(dictionary.get(beforeWord));
                // 사전에 추가
                dictionary.put(word, lastIndex++);
                // 현재 입력을 수정
                beforeWord = msgArr[i];
            } else {
                // 현재 입력을 변경하고 다음 index 탐색
                beforeWord = word;
            }

            // 주어진 문장의 마지막 단어인 경우 추가
            if (i == msgArr.length - 1) {
                answerList.add(dictionary.get(beforeWord));
            }
        }

        return answerList.stream().mapToInt(it -> it).toArray();
    }
}
