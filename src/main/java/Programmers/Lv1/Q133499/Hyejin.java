package Programmers.Lv1.Q133499;

public class Hyejin {

    public int solution(String[] babbling) {
        int count = 0;
        String[] ableWords = {"aya", "woo", "ye", "ma"};
        String[] repeatWords = {"ayaaya", "yeye", "woowoo", "mama"};

        case1:
        for (String word : babbling) {
            for (String rw : repeatWords) {
                if (word.contains(rw)) continue case1;
            }

            for (String aw : ableWords) {
                word = word.replaceAll(aw, "1");
            }
            word = word.replaceAll("1","");
            if (word.length() == 0) count++;

        }
        return count;
    }

}
