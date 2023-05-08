package Programmers.Lv2.Q17686;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hyejin {
    //0.48ms, 71.5MB
    //7.21ms, 81.7MB
    public String[] solution(String[] files) {
        List<File> list = new ArrayList<>();
        for (String s : files) {
            int numIdx = -1;
            int tailIdx = -1;
            for (int i = 0; i < s.length(); i++) {
                //숫자 위치를 아직 모르는 경우 => number찾아야함
                if (numIdx == -1) {
                    if (Character.isDigit(s.charAt(i))) {
                        numIdx = i;
                        continue;
                    }
                }
                //숫자 위치를 아는 경우 => tail찾아야함
                if (numIdx >= 0 && tailIdx == -1) {
                    if (!Character.isDigit(s.charAt(i))) {
                        tailIdx = i;
                    }
                }
            }

            String head = s.substring(0, numIdx);
            String number = "";
            if (tailIdx == -1) {
                //tail이 없는 경우
                number = s.substring(numIdx);
            } else {
                //tail이 있는 경우
                number = s.substring(numIdx, tailIdx);
            }

            list.add(new File(s, head.toLowerCase(), Integer.parseInt(number)));
        }
        Collections.sort(list);
        String[] result = new String[files.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).actual;
        }
        return result;
    }

    public static class File implements Comparable<File> {
        String actual;
        String head;
        int number;

        public File(String actual, String head, int number) {
            this.actual = actual;
            this.head = head;
            this.number = number;
        }

        @Override
        public int compareTo(File o) {
            //head가 같다면 숫자로 정렬
            if (this.head.equals(o.head)) return this.number - o.number;
            //head순으로 정렬
            return this.head.compareTo(o.head);
        }
    }
}
