package Programmers.Lv1.Q76501;

public class Hyejin {
    //0.06ms, 82.5MB
    public int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
           if(signs[i]){
               result+=absolutes[i];
           }else {
               result-=absolutes[i];
           }
        }
        return result;
    }
}
