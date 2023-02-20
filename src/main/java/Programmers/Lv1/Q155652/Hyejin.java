package Programmers.Lv1.Q155652;

public class Hyejin {
    public String solution(String s, String skip, int index) {
        //0.04ms, 75.1MB
        //0.19ms, 72.4MB
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {

            int count = 0;
            while (count < index) {
                //count만큼 이동시킨다
                c++;
                //z가 넘어가면 a로 변환한다
                c = c > 122 ? (char) (96 + (c % 122)) : c;
                //skip에 포함되어 있으면 count를 증가시키지 않는다
                count = skip.indexOf(c) > -1 ? count : count + 1;
            }

            answer.append(c);
        }
        return answer.toString();
    }
}
