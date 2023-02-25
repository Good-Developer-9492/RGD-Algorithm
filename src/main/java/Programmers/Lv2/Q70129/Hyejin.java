package Programmers.Lv2.Q70129;

public class Hyejin {
    //0.12ms, 72.7MB
    //29.10ms, 94MB
    public int[] solution(String s) {
        int zeroCount = 0;
        int convertCount = 0;

        //1인지 확인
        while (!s.equals("1")) {

            //0을 제거한다
            String replaceS = s.replaceAll("0", "");

            zeroCount += s.length() - replaceS.length() ;

            //길이를 2진법으로 변환한다
            s = Integer.toBinaryString(replaceS.length());
            convertCount++;

        }

        return new int[]{convertCount, zeroCount};
    }


}
