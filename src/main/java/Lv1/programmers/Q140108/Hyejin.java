package Lv1.programmers.Q140108;

public class Hyejin {
    //0.02ms, 84.6MB
    //25.00ms, 79.4MB
    public int solution(String s) {
        int answer = 0;

        for(int i = 0 ; i< s.length(); i++){
            //첫번째 문자열을 얻는다
            char first = s.charAt(i);
            int xCount = 1;
            int otherCount = 0;

            //개수가 같아질때까지 다음 문자를 확인한다.
            while ((!(xCount == otherCount)) && i< s.length()-1){
                i++;
                if(first == s.charAt(i)) xCount++;
                else otherCount++;
            }
            answer++;
        }
        return answer;
    }
}
