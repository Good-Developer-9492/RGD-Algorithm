package Lv1.programmers.Q131128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hyunho {
    //0.36ms, 75.6MB - 1269.28ms, 389MB
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        List<Character> xArray = new ArrayList<>();
        for (int i = 0; i < X.length(); i++) {
            xArray.add(X.charAt(i));
        }
        xArray.sort(Collections.reverseOrder());

        List<Character> yArray = new ArrayList<>();
        for (int i = 0; i < Y.length(); i++) {
            yArray.add(Y.charAt(i));
        }
        yArray.sort(Collections.reverseOrder());

        int maxSize = Math.max(xArray.size(), yArray.size());
        int xIdx = 0;
        int yIdx = 0;

        while (xIdx < xArray.size() && yIdx < yArray.size()){
            if (xArray.get(xIdx) == yArray.get(yIdx)) {
                answer.append(xArray.get(xIdx));
                xIdx++;
                yIdx++;
            } else if (xArray.get(xIdx) > yArray.get(yIdx)) {
                xIdx++;
            } else if (xArray.get(xIdx) < yArray.get(yIdx)) {
                yIdx++;
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }
        if ((answer.charAt(0)) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
