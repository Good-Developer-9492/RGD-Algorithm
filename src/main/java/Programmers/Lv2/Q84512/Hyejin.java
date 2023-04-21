package Programmers.Lv2.Q84512;

import java.util.ArrayList;
import java.util.List;

public class Hyejin {
    //1.10ms, 73.7MB
    //61.02ms, 80.9MB
    //A', 'E', 'I', 'O', 'U
    //a -> aa -> aaa -> aaaa -> aaaaa  -> aaaae -> aaaai -> aaaao -> aaaau->  aaae -> aaai -> aaaao -> aaaau
    String[] words = {"A", "E", "I", "O", "U"};
    int length = 5;
    List<String> dic = new ArrayList<>();

    public int solution(String word) {
        for (int i = 0; i < length; i++) {
            dfs(words[i],word);
        }
        return dic.size();
    }

    public void dfs(String dicWord,String word) {
        //기준 단어까지 다 만들어 졌을 때 빠져나가기
        if(dic.contains(word)){
            return;
        }

        if (!dic.contains(dicWord)) {
            dic.add(dicWord);
        }

        if(dicWord.length()+1 > length) return;

        for (int i = 0; i < length; i++) {
            dfs(dicWord + words[i], word);
        }

    }
}
