package Programmers.Lv2.Q17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hyejin {
    public int[] solution(String msg) {
        Map<String, Integer> dic = new HashMap<>();
        //알파벳 인덱스에 넣기
        char alphabet = 'A';
        int index = 26;
        for (int i = 1; i <= index; i++) {
            dic.put(String.valueOf(alphabet++), i);
        }
        List<Integer> answerList = new ArrayList<>();


        for (int i = 0; i < msg.length(); i++) {
            //문자열 자르기
            String s = String.valueOf(msg.charAt(i));

            //인덱스 찾기
            int dicIndex = dic.get(s);

            while (i<msg.length()-1) {
                s = s+msg.charAt(i+1);
                //사전에 없으면
                if(dic.get(s)==null) break;

                dicIndex = dic.get(s);
                i++;
            }
            //있는 단어까지만 프린트
            answerList.add(dicIndex);
            //없는단어 사전에 넣기
            dic.put(s,++index);
        }

        return answerList.stream().mapToInt(a->a).toArray();
    }
}
