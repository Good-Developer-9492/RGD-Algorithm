package Lv1.programmers.Q131128;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hyejin {
    public String solution(String X, String Y) {
        //0.37ms, 67.8MB
        //1212.38ms, 278MB

        List<Character> xList = new ArrayList<>();
        for (char c : X.toCharArray()) xList.add(c);
        xList.sort(Comparator.reverseOrder());

        List<Character> yList = new ArrayList<>();
        for (char c : Y.toCharArray()) yList.add(c);
        yList.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();

        int xp = 0;
        int yp = 0;
        while (xp < xList.size() && yp < yList.size()) {
            char x = xList.get(xp);
            char y = yList.get(yp);
            //같은 글자면 정답에 넣기
            if (x == y) {
                sb.append(x);
                xp++;
                yp++;

                //x값이 크면 y에는 없는 값임
            } else if (x > y) {
                xp++;

                //y값이 크면 x에는 없는 값임
            } else yp++;
        }

        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}
