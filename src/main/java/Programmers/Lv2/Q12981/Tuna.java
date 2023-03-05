package Programmers.Lv2.Q12981;

import java.util.HashSet;
import java.util.Set;

public class Tuna {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        int defeatNum = 0;
        int defeatCount = 0;

        for (int i = 0; i < words.length; i++) {
            if (
                words[i].length() <= 1 || // 한글자인 단어일 경우
                    set.contains(words[i]) || // 앞서 나왔던 단어일 경우
                    ( // 앞사람이 말한 단어의 마지막 문자로 시작하는 단어가 아닐 경우
                        i > 0 &&
                            words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)
                    )
            ) {
                // n명의 사람이 반복하므로 n으로 나눈 나머지가 사람의 순서
                defeatNum = i % n + 1;
                // n명의 사람이 반복하므로 n으로 나눈 몫이 차례
                defeatCount = i / n + 1;
                break;
            }

            // 앞서 나왔던 단어로 저장
            set.add(words[i]);
        }

        return new int[]{defeatNum, defeatCount};
    }
}
