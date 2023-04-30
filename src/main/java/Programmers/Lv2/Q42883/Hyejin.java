package Programmers.Lv2.Q42883;

public class Hyejin {
    //number - k 자리의 문자열을 만들어야 한다
    //0 ~ k 범위에서 큰 값 찾기
    // 이전 큰값 idx ~ k+1 범위에서 큰 값찾기
    // 이전 큰값 idx ~ k+2 범위에서 큰 값 찾기
    //..반복
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int start = 0;

        //number - k -1 번 반복함
        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;
            //범위 내에서 가장 큰 값 찾기
            for(int j = start ; j<= i+k; j++){
                char pick = number.charAt(j);
                if(pick> max){
                    max = pick;
                    start = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
