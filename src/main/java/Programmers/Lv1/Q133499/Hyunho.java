package Programmers.Lv1.Q133499;

public class Hyunho {
    //0.09ms, 76.3MB - 1.50ms, 76.3MB
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {

            if (babbling[i].contains("ayaaya") ||
                babbling[i].contains("yeye") ||
                babbling[i].contains("woowoo") ||
                babbling[i].contains("mama")) {
                continue;
            }

            //발음 할 수 있는 단어가 있으면 해당 단어를 빈 문자로 변환
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            //문자열이 빈 문자열이면 카운트 증가
            if (babbling[i].length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}
